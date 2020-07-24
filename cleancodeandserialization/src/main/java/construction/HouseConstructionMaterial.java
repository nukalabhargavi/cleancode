package construction;

public class HouseConstructionMaterial {
	   String materialType;
	   double totalAreaOfHouse;
	   String automationType;
	   HouseConstructionMaterial(){}
	   HouseConstructionMaterial(String materialType,double totalAreaOfHouse,String automationType)
	   {
		   this.materialType=materialType;
		   this.totalAreaOfHouse=totalAreaOfHouse;
		   this.automationType=automationType;
	   }
	   public String calculateHouseConstructionCost(String materialType, double totalAreaOfHouse, String automationType) throws Exception
	   {
		   ConstructionCostOfHouse constructionCost=new  ConstructionCostOfHouse(materialType, totalAreaOfHouse, automationType);
		   return String.valueOf(constructionCost.computeCostOfHouseConstruction())+"INR";
	   }
	}