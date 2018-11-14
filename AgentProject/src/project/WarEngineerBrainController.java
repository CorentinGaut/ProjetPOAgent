package project;

import java.util.*;

import com.android.okhttp.ResponseSource;

import edu.warbot.agents.agents.WarEngineer;
import edu.warbot.agents.enums.WarAgentType;
import edu.warbot.agents.percepts.WarAgentPercept;
import edu.warbot.brains.brains.WarEngineerBrain;

public abstract class WarEngineerBrainController extends WarEngineerBrain {


    public WarEngineerBrainController() {
        super();
    }

    @Override
    public String action() {

    	List<WarAgentPercept> resources = getPercepts();
    	
    	
    	for (int i = 0;i< resources.size();i++){
    		if (resources.get(i).getType() == WarAgentType.WarFood){
    			return WarEngineer.ACTION_BUILD;
    		}
    	}
    	
    	
        return WarEngineer.ACTION_MOVE;
        
    }
}
