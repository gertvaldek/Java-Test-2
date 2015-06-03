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
	                	if (p.getAngle() <= 30 && p.getAngle() >= 15 ) {
	                	System.out.println(p.getAngle());
	                	System.out.println(p.getSort());
	                	
	                    System.out.println("Thread ID - " + Thread.currentThread().getName());
	                    System.out.println("---------------------------");
	                	} 
	                }
	            }
	        };
	        
	        // Removes bananas with angle less than 15 or bigger than 30
	        Runnable bananaRunnable2 = new Runnable(){
	            @Override
	            public void run() {
	                Banana p = null;
	                while((p = giveMeBanana())!= null){
	                	if (p.getAngle() > 30 || p.getAngle() < 15) {
	                	System.out.println(p.getAngle());
	                	System.out.println(p.getSort());
	                	
	                    System.out.println("Thread ID - " + Thread.currentThread().getName());
	                    System.out.println("---------------------------");
	                	} 
	                }
	            }
	        };
	        
	        // Remove bananas if readyLevel is bigger or equal than 6 
	        Runnable bananaRunnable3 = new Runnable(){
	            @Override
	            public void run() {
	                Banana p = null;
	                while((p = giveMeBanana())!= null){
	                	if (p.getAngle() > 30) {
	                	System.out.println(p.getAngle());
	                	System.out.println(p.getSort());
	                	
	                    System.out.println("Thread ID - " + Thread.currentThread().getName());
	                    System.out.println("---------------------------");
	                	} 
	                }
	            }
	        };
	        
	         Thread t1 = new Thread(bananaRunnable1);
	         Thread t2 = new Thread(bananaRunnable2);
	         Thread t3 = new Thread(bananaRunnable3);
	         
	            t1.start();
	            t2.start();
	            t3.start();
	            try {
	                Thread.sleep(15);
	            } catch (InterruptedException e) {
	                // TODO Auto-generated catch block
	                e.printStackTrace();
	            }
	    		t1.interrupt();
	    		t2.interrupt();
	    		t3.interrupt();
	        

}

}