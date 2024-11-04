package de.unistuttgart.iste.sqa.pse.sheet03.homework;

import de.hamstersimulator.objectsfirst.external.model.Hamster;

/**
 *
 * A control unit to control a hamster.
 *
 * A HamsterController knows some behavioural patterns for hamsters and makes
 * the controlled hamsters act according to those patterns.
 *
 * @author (Your name)
 *
 */
public class HamsterController {

	private Hamster controlledHamster;

	/**
	 * Create a new controller for the controlling the given hamster.
	 *
	 * @param hamster The hamster that will be controlled, must not be null.
	 */
	public HamsterController {
		this.controlledHamster = hamster;
		

		
		controlledHamster.write("Executing pickAllGrains:");
		Integer counter = 0;
		while (controlledHamster.grainAvailable()) {
			controlledHamster.pickGrain();
			counter++;						
		

	/**
	 * Pick all grains on the controlled hamster's tile.
	 *
	 * Ensures that the tile is empty.
	 */
	void pickAllGrains() {
		// move in the direction of the first grain
		controlledhamster.move();
		// pick up the first grain
		controlledhamster.pickGrain();
		// move in the direction of the second grain
		controlledhamster.move();
		// pick up the second grain
		controlledhamster.pickGrain();
		// turn in the direction of the third and fourth grain
		controlledhamster.turnLeft();
		controlledhamster.turnLeft();
		controlledhamster.turnLeft();
		// move in the direction of the  third and fourth grain
		controlledhamster.ove();
		// pick up the grains
		controlledhamster.pickGrain();
		controlledhamster.pickGrain();
		
		// move in the direction of the fifth grain
		controlledhamster.move();
		// turn in the direction of the fifth grain
		controlledhamster.turnLeft();
		controlledhamster.turnLeft();
		controlledhamster.turnLeft();
		// pick up the  grain
		controlledhamster.pickGrain();
		// move in the direction of the sixth, seventh, eighth and nineth grain
		controlledhamster.move();
		// turn in the direction of the sixth, seventh, eighth and nineth grain
		controlledhamster.turnLeft();
		// move in the direction of the sixth, seventh, eighth and nineth grain
		controlledhamster.move();
		// pick up the grains
		controlledhamster.pickGrain();
		controlledhamster.pickGrain();
		controlledhamster.pickGrain();
		controlledhamster.pickGrain();
		// turn in the direction of the treffpunkt
		controlledhamster.turnLeft();
		controlledhamster.turnLeft();
		// move in the direction of the treffpunkt
		controlledhamster.move();
		controlledhamster.move();
		controlledhamster.move();
tiffany = new Hamster();

	/**
	 * Pick all grains on the controlled hamster's tile.
	 *
	 * Ensures that the tile is empty.
	 */
	void pickAllGrains() 

			
		}
		controlledHamster.write(String.format("%d available grains on my Tile. I picked all of them!", counter));
	}

	/**
	 * Put all the controlled hamster's grain on the current tile.
	 *
	 * Ensures that the controlled hamster's mouth is empty.
	 */
	void putAllGrains() {
		controlledHamster.write("Executing putAllGrains:");
		Integer counter = 0;
		while (!controlledHamster.mouthEmpty()) {
			controlledHamster.putGrain();
			counter++;
		}
		controlledHamster.write(String.format("I had %d grains in my mouth. I put all of them on my Tile!", counter));
	}

	// Ttiffany = new Hamster();
		tiffany.int(territory, location, direction,1)
		// move in the direction of the grains
		tiffany.move();
		// pick up the grains
		tiffany.pickGrain();
		tiffany.pickGrain();
		tiffany.pckGrain();
		tiffany.pickGrain();
		// turn in the direction of the Grains
		tiffany.turnLeft();
		//move in the direction of the grains
		tiffany.move();
		tiffany.move();
		// pick up the grains
		tiffany.pickGrains();
		tiffany.pickGrains();
		tiffany.pickGrains();
		tiffany.pickGrains();
		tiffany.pickGrains();
		tiffany.pickGrains();
		// turn in the direction of the grains
		tiffany.turnLeft();
		tiffany.turnLeft();
		tiffany.turnLeft();
		// move in the directions of the grains
		tiffany.move();
		tiffany.move();
		// pick up the grains
		tiffany.pickGrains();
		tiffany.pickGrains();
		// turn in the direction of the treffpunkt
		tiffany.turnLeft();
		tiffany.turnLeft();
		tiffany.turnLeft();
		// move in the direction of the treffpunkt
		tiffany.move();
		tiffany.move();
		tiffany.move();
										
		
		
	}

	/**
	 * Pick all grains on the controlled hamster's tile.
	 *
	 * Ensures that the tile is empty.
	 */
	void pickAllGrains() {
		// move in the direction of the first grain
		controlledhamster.move();
		// pick up the first grain
		controlledhamster.pickGrain();
		// move in the direction of the second grain
		controlledhamster.move();
		// pick up the second grain
		controlledhamster.pickGrain();
		// turn in the direction of the third and fourth grain
		controlledhamster.turnLeft();
		controlledhamster.turnLeft();
		controlledhamster.turnLeft();
		// move in the direction of the  third and fourth grain
		controlledhamster.ove();
		// pick up the grains
		controlledhamster.pickGrain();
		controlledhamster.pickGrain();
		
		// move in the direction of the fifth grain
		controlledhamster.move();
		// turn in the direction of the fifth grain
		controlledhamster.turnLeft();
		controlledhamster.turnLeft();
		controlledhamster.turnLeft();
		// pick up the  grain
		controlledhamster.pickGrain();
		// move in the direction of the sixth, seventh, eighth and nineth grain
		controlledhamster.move();
		// turn in the direction of the sixth, seventh, eighth and nineth grain
		controlledhamster.turnLeft();
		// move in the direction of the sixth, seventh, eighth and nineth grain
		controlledhamster.move();
		// pick up the grains
		controlledhamster.pickGrain();
		controlledhamster.pickGrain();
		controlledhamster.pickGrain();
		controlledhamster.pickGrain();
		// turn in the direction of the treffpunkt
		controlledhamster.turnLeft();
		controlledhamster.turnLeft();
		// move in the direction of the treffpunkt
		controlledhamster.move();
		controlledhamster.move();
		controlledhamster.move();
	}
