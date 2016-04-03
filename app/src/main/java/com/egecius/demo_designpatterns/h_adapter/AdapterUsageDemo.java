package com.egecius.demo_designpatterns.h_adapter;

final class AdapterUsageDemo {

	void demoAdapterThirdParty() {
		Adapter adapter = new Adapter(new ThirdPartyPlayer());
		Client client = new Client(adapter);
		client.demo();
	}

	void demoInHouseImplementation() {
		InHouseImplementation implementation = new InHouseImplementation();
		Client client = new Client(implementation);
		client.demo();
	}
}
