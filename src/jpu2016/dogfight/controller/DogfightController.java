package jpu2016.dogfight.controller;
import java.util.ArrayList;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

import jpu2016.dogfight.model.*;
import jpu2016.dogfight.view.*;

public class DogfightController implements IOrderPerformer{
	
	private final int TIME_SLEEP =30;
	private ArrayList<IDogfihgtModel> dofightModel ;
	private ArrayList<IViewSysteme> viewSystem ;
	
	
	
	public void play() {
		
	}
	
	public void setViewSystem(IViewSysteme viewSystem) {
		
	}
	
	private void lauchMissile(int player) {
		
	}
	
	private void gameLoop() {
		
	}
	@Override
	public void orderPerform(UserOrder userOrder) {
		// TODO Auto-generated method stub
		
	}
	//////////////////////////////////////get/set///////////////////////////////////////////////
	public ArrayList<IDogfihgtModel> getDofightModel() {
		return dofightModel;
	}

	public void setDofightModel(ArrayList<IDogfihgtModel> dofightModel) {
		this.dofightModel = dofightModel;
	}

	public ArrayList<IViewSysteme> getViewSystem() {
		return viewSystem;
	}

	public void setViewSystem(ArrayList<IViewSysteme> viewSystem) {
		this.viewSystem = viewSystem;
	}

	public int getTIME_SLEEP() {
		return TIME_SLEEP;
	}

	public DogfightController(IDogfihgtModel dofightModel) {
		IDogfihgtModel = dofightModel;
	}
}
