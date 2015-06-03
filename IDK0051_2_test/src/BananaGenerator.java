import java.util.ArrayList;
import java.util.List;


public class BananaGenerator {
	
	   private static int bananaIndex = 0;

	    private static synchronized Banana giveMeBanana(){
	        if(bananaIndex < bananas.size()){
	            return bananas.get(bananaIndex++);
	        }
	        return null;
	    }

		private static List<Banana> bananas = new ArrayList<>();
	    public static void main(String[] args) {
	    	
	    	// 670 Indian bananas
	        for (int i = 0; i<=670; i++) {
	            BananaIndia p = new BananaIndia();
	            p.setSort("Wild");
	            p.setAngle(25);
	            p.setReadyLevel(5);
	            p.setWeight(230);
	            bananas.add(p);
	        }	        
	        // 50 other normal bananas
	        for (int i = 0; i<=50; i++) {
	            BananaOther p = new BananaOther();
	            p.setSort("Normal");
	            p.setAngle(20);
	            p.setReadyLevel(8);
	            p.setWeight(210);
	            bananas.add(p);
	        }
	        // 50 other wild bananas
	        for (int i = 0; i<=50; i++) {
	            BananaIndia p = new BananaIndia();
	            p.setSort("Wild");
	            p.setAngle(25);
	            p.setReadyLevel(5);
	            p.setWeight(180);
	            bananas.add(p);
	        }
	        for (int i = 0; i<=330; i++) {
	            BananaOther p = new BananaOther();
	            p.setSort("Wild");
	            p.setAngle(45);
	            p.setReadyLevel(6);
	            p.setWeight(180);
	            bananas.add(p);
	        }
	        for (int i = 0; i<=400; i++) {
	            BananaOther p = new BananaOther();
	            p.setSort("Wild");
	            p.setAngle(45);
	            p.setReadyLevel(10);
	            p.setWeight(180);
	            bananas.add(p);

	        }
	        
	        Runnable bananaRunnable1 = new Runnable(){
	            @Override
	            public void run() {
	                Banana p = null;
	                while((p = giveMeBanana())!= null){

	                    System.out.println("---------------------------");
	                }
	            }
	        };
	        
	         Thread t = new Thread(bananaRunnable1);
	            t.start();
	            try {
	                Thread.sleep(15);
	            } catch (InterruptedException e) {
	                // TODO Auto-generated catch block
	                e.printStackTrace();
	            }
	    		t.interrupt();
	        

}

}