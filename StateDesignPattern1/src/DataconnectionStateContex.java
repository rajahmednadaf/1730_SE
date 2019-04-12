
public class DataconnectionStateContex {
	DataConnectionState state;

	

	 public void setPresentState(DataConnectionOffState presentState) {
	        this.state = (DataConnectionState) presentState;
	    }
	 
	 public void setPresentState(DataConnectionOnState presentState) {
	        this.state = (DataConnectionState) presentState;
	    }
	 
    public void info() {
        state.state();
    }

}
