package GoogleCloudProject.GoogleCloudProject;

import org.apache.juneau.json.JsonSerializer;
import org.apache.juneau.serializer.SerializeException;

import pojo.Origin;
import pojo.Resource;
import pojo.Root;

public class JsonSetter {

	
	public Root pojoToJSON() throws SerializeException {
		Root root = new Root();
		Resource resource = new Resource();
		root.setResource(resource);
		Origin origin = new Origin();
		root.set_origin(origin);
		root.set_activityId(UUIDGenerator.uuidGenerator());
		root.set_id(UUIDGenerator.uuidGenerator());
		root.set_timestamp(1536616434);
		root.set_version("1");

		resource.setAltIncentiveAmount("300.0");
		resource.setaMCampaignId("20211109161516132489005");
		resource.setaMCampaignName("Puneet_JanuaryTest");
		resource.setApprovalDate("11/01/21");
		resource.setApproverName("Tim");
		resource.setBrand("AUDI");
		resource.setBrandId("AU");
		resource.setChromeId("402843");
		resource.setClosedDealId("6ADB18C0-188A-4486-9BC1-0032EB71DA16");
		resource.setCurrentAmVehicleId("08D67B3B-3FD3-38FD-6217-680001000110");
		resource.setCustomerNumber("241199");
		resource.setDealerId("AU0098");
		resource.setDealerName("Audi Chantilly");
		resource.setEligibleDealTypes("ALL");
		resource.setEndDate("03/30/22");
		resource.setExclusionModelCodes("8W254B,8UG5CP");
		resource.setExclusionModels("R7");
		resource.setExclusionModelYears("2020,2019");
		resource.setId(UUIDGenerator.uuidGenerator());
		resource.setoEMBulletinName("Experiential Marketing Incentive Program");
		resource.setoEMBulletinNumber("A21UACB1");
		resource.setOfferamModels("R8");
		resource.setOfferAmVehicleId("08D7F523-B8D0-03DC-F69C-FC0001000008");
		resource.setOfferAmVehicleIdTrim("A4 Sedan Premium 40 TFSI");
		resource.setOfferChromeId("411851");
		resource.setOfferIncentiveAmount("1000");
		resource.setOfferModelCodes("4S35BE,8K251A");
		resource.setOfferModelYear("2020");
		resource.setRedemptionCode("07BC4341");
		resource.setStartDate("01/06/22");
		resource.setVersion("1");
		resource.setVin("5N1BA0NF5FN605092");

		origin.setContainer("containernameasastring");
		origin.setName("am.private.incentives");
		origin.setNamespace("stg");
		origin.setNode("nodenameasastring");
		origin.setPod("feb8734");
		origin.setVersion("2.0.0");

		return root;

	}

}
