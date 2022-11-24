import "@cadl-lang/rest";
import "@azure-tools/cadl-azure-core";
import "@cadl-lang/openapi";

using Cadl.Http;
using Cadl.Rest;
using Azure.Core;
using Azure.Core.Foundations;



interface Discoveries {
#suppress "@azure-tools/cadl-azure-core/use-standard-operations" "ADP data-plane API uses custom operation."
@doc("Creates a new ingestion discovery instance.")
createOrReplace is CustomResourceCreateOrReplace<
Discovery,
CustomBodyWrapper<DiscoveryCreationParameters>
>;
}

@doc("A discovery resource.")
@resource("discoveries")
@friendlyName("Discovery")
model Discovery {
@key
id: string;

    @doc("ID of the external package (for example, the disk which contained data) which was used upon the creation of upload")
    @visibility("read", "create")
    externalPackageId?: string;

    @format("uri")
    @doc("""
    SAS signed URI for uploading or reading the discovery manifest file on Azure Storage.
    Note, if the discovery status is 'Created' then the URI is signed with 'Write' permissions, otherwise with 'Read' permission.
    This URI expires in 24 hours.
    """)
    @visibility("read")
    manifestUploadUri?: string;

}

@doc("Discovery resource creation parameters.")
@friendlyName("DiscoveryCreationParameters")
@withVisibility("create")
@withoutOmittedProperties("discoveryId")
model DiscoveryCreationParameters {
...Discovery;
}


@doc("Internal - the model for internal use")
@friendlyName("DiscoveryIdentifier")
model DiscoveryIdentifier {
@doc("The discovery identifier.")
@key
@minLength(1)
@maxLength(36)
discoveryId: string;
}


op CustomResourceCreateOrReplace<
T,
TResourceCreateParams
> is CustomResourceOperation<
T,
CustomResourceCreateOrReplaceModel<T> & TResourceCreateParams,
CustomResourceCreatedOrOkResponse<T>
>;

#suppress "@azure-tools/cadl-azure-resource-manager/no-response-body" "This operation must return a status monitor in its response."
@autoRoute
op CustomResourceOperation<TResource, TParams, TResponse> is Operation<
Foundations.ItemKeysOf<TResource> & TParams,
TResponse
>;


@omitKeyProperties
model CustomResourceCreateOrReplaceModel<TResource>
is UpdateableProperties<DefaultKeyVisibility<TResource, "read">>;


model CustomResourceCreatedResponse<T> {
...Cadl.Http.Response<201>;
@body body: T;
}


alias CustomResourceCreatedOrOkResponse<T> = CustomResourceCreatedResponse<T> | CustomResourceOkResponse<T>;

@doc("A wrapper for optional parameter in the body. The intent of model is to add description to 'body'")
model CustomBodyWrapper<T> {
@body
body?: T;
}

model CustomResourceOkResponse<T> {
...Cadl.Http.Response<200>;
@body body: T;
}





