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
package org.isisaddons.module.security.fixture.scripts.tenancy;

import org.isisaddons.module.security.seed.scripts.GlobalTenancy;

public class AllTenancies extends AbstractTenancyFixtureScript {

    @Override
    protected void execute(ExecutionContext executionContext) {
        executionContext.executeChild(this, new GlobalTenancy());

        executionContext.executeChild(this, new ItalyTenancy());
        executionContext.executeChild(this, new MilanTenancy());
        executionContext.executeChild(this, new RomeTenancy());

        executionContext.executeChild(this, new FranceTenancy());
        executionContext.executeChild(this, new ParisTenancy());
        executionContext.executeChild(this, new LyonTenancy());
        executionContext.executeChild(this, new NiceTenancy());

        executionContext.executeChild(this, new SwedenTenancy());
        executionContext.executeChild(this, new StockholmTenancy());
    }

}
