package ca.uhn.fhir.rest.client;

import ca.uhn.fhir.model.api.Bundle;
import ca.uhn.fhir.model.dstu.composite.IdentifierDt;
import ca.uhn.fhir.model.dstu.resource.Patient;
import ca.uhn.fhir.model.primitive.IdDt;
import ca.uhn.fhir.model.primitive.StringDt;
import ca.uhn.fhir.rest.annotation.Read;
import ca.uhn.fhir.rest.client.api.IMetadataClient;
import ca.uhn.fhir.rest.server.operations.Search;
import ca.uhn.fhir.rest.server.parameters.Optional;
import ca.uhn.fhir.rest.server.parameters.Required;

public interface ITestClient extends IMetadataClient {

	@Read(type=Patient.class)
	Patient getPatientById(@Read.IdParam IdDt theId);

	@Read(type=Patient.class)
	Patient getPatientByVersionId(@Read.IdParam IdDt theId, @Read.VersionIdParam IdDt theVersionId);

	@Search(type=Patient.class)
	Patient findPatientByMrn(@Required(name = Patient.SP_IDENTIFIER) IdentifierDt theId);
	
	@Search(type=Patient.class)
	Bundle findPatientByName(@Required(name = Patient.SP_FAMILY) StringDt theId, @Optional(name=Patient.SP_GIVEN) StringDt theGiven);
	
	
}
