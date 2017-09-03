
## Comment lancer le main de la question 7 ?

	java -jar rental-agency.jar


## Extraire les fichiers de l'archive:

	jar xvf rental-agency.jar


## Comment compiler les classes du projet ?

	make compilAll

## Comment générer la documentation ?

	make doc

## Comment compiler puis exécuter les tests ?

Après avoir compilé les sources:

	make testAll

Ou un par un:

	make BrandCriterionTest;
	make PriceCriterionTest;
	make InterCriterionTest;
	make ClientTest;
	make VehicleTest;
	make CarTest;
	make MBTest;
	make AgencyTest;
	make SuspiciousAgencyTest;
