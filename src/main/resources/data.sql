INSERT INTO counters (cvalue) SELECT 0 WHERE NOT EXISTS (SELECT * FROM counters);
