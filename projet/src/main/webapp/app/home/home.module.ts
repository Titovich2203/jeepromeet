import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';

import { OnDemandServicesSharedModule } from 'app/shared/shared.module';
import { HOME_ROUTE } from './home.route';
import { HomeComponent } from './home.component';

@NgModule({
  imports: [OnDemandServicesSharedModule, RouterModule.forChild([HOME_ROUTE])],
  declarations: [HomeComponent],
})
export class OnDemandServicesHomeModule {}
