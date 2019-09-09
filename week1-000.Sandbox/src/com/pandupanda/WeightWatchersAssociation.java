package com.pandupanda;

import java.util.ArrayList;

public class WeightWatchersAssociation {
  // OBJECT VARIABLES .. FIELDS
  private double lowestWeightIndex;
  private String name;
  private ArrayList<Person> members;

  // OBJECT CONSTRUCTOR
  public WeightWatchersAssociation(double indexLimit) {
        this.lowestWeightIndex = indexLimit;
  }

  public WeightWatchersAssociation(String name, double lowestWeightIndex) {
    this.lowestWeightIndex = lowestWeightIndex;
    this.name = name;
    this.members = new ArrayList<Person>();
  }
    
      // OBJECT METHOD
      public Person