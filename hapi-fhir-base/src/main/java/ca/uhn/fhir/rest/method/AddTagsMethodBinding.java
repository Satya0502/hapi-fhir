package ca.uhn.fhir.rest.method;

/*
 * #%L
 * HAPI FHIR Library
 * %%
 * Copyright (C) 2014 University Health Network
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import java.lang.reflect.Method;

import ca.uhn.fhir.context.FhirContext;
import ca.uhn.fhir.rest.annotation.AddTags;

public class AddTagsMethodBinding extends BaseAddOrDeleteTagsMethodBinding {

	public AddTagsMethodBinding(Method theMethod, FhirContext theConetxt, Object theProvider, AddTags theAnnotation) {
		super(theMethod, theConetxt, theProvider, theAnnotation.type());
	}

	@Override
	protected boolean isDelete() {
		return false;
	}

}
