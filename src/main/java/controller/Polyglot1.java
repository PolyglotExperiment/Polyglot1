package controller;

import dao.LandmarkDAO;
import ef.qb.core.QueryBuilder;

public class Polyglot1 {

    private static LandmarkDAO landmarkDAO;

    public Polyglot1() {
        landmarkDAO = QueryBuilder.create(LandmarkDAO.class);
    }

    public int sumCostsByLocation(String location) {
        /*
        * implement here
         */
        return 0;
    }

}
