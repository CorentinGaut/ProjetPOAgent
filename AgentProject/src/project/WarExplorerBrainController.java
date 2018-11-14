package project;


import java.util.List;

import edu.warbot.agents.agents.WarEngineer;
import edu.warbot.agents.agents.WarExplorer;
import edu.warbot.agents.enums.WarAgentType;
import edu.warbot.agents.percepts.WarAgentPercept;
import edu.warbot.agents.percepts.WarPercept;
import edu.warbot.brains.brains.WarExplorerBrain;

public abstract class WarExplorerBrainController extends WarExplorerBrain {

    public WarExplorerBrainController() {
        super();

    }
    

    @Override
    public String action() {

List<WarAgentPercept> resources = getPercepts();
    	
    	
    	for (int i = 0;i< resources.size();i++){
    		if (resources.get(i).getType() == WarAgentType.WarFood){
    			this.setDebugString("FOOD !");
    			
    			if (isBagEmpty()){
    				return WarExplorer.ACTION_TAKE;
    			}else{
    				return WarExplorer.ACTION_MOVE;
    			}
    			
    		}else{
    			return WarExplorer.ACTION_MOVE;
    		}
    	}
    	
   
    	
        if (isBlocked())
            setRandomHeading();
        
        
        return WarExplorer.ACTION_MOVE;
        
       
    }

}
