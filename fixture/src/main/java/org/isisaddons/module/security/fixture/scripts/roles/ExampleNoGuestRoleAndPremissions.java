/*
 *  Copyright 2014 Dan Haywood
 *
 *  Licensed under the Apache License, Version 2.0 (the
 *  "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 */
package org.isisaddons.module.security.fixture.scripts.roles;

import org.isisaddons.module.security.dom.permission.ApplicationPermissionMode;
import org.isisaddons.module.security.dom.permission.ApplicationPermissionRule;
import org.isisaddons.module.security.fixture.dom.example.nontenanted.NonTenantedEntity;
import org.isisaddons.module.security.seed.scripts.AbstractRoleAndPermissionsFixtureScript;

/**
 * Intended to conflict with {@link ExampleGuestRoleAndPermissions}
 */
public class ExampleNoGuestRoleAndPremissions extends AbstractRoleAndPermissionsFixtureScript {

    public static final String ROLE_NAME = "example-no-guest";

    public ExampleNoGuestRoleAndPremissions() {
        super(ROLE_NAME, "No access to example dom");
    }

    @Override
    protected void execute(ExecutionContext executionContext) {
        newPackagePermissions(
                ApplicationPermissionRule.VETO,
                ApplicationPermissionMode.VIEWING,
                NonTenantedEntity.class.getPackage().getName());
    }

}
