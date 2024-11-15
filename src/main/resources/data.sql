INSERT INTO users (id, name) VALUES
(1, 'John Doe'),
(2, 'Jane Doe');

INSERT INTO spacecraft_stats (id, speed, hull, shield, damage, manuvrability) VALUES
(1, 10,  30,  80,  60,  80),
(2, 60,  50,  10,  0,   50),
(3, 100, 20,  10,  10,  30),
(4, 30,  120, 110, 200, 10),
(5, 60,  90,  80,  0,   10);

INSERT INTO spacecrafts (id, name, spacecraft_registry, manufacturer, manufactured, height, length, price, type, store_type, base_stats_id) VALUES
(1, 'Draxon SA-22', 'drax22',   'Epsilon Laboratories', 2129, 12,  80,  3055555, 'INTERCEPTOR', 'SPACECRAFT', 1),
(2, 'Cygnia F35',   'cygf35',   'Cygnia Corporation',   2157, 219, 456, 4550000, 'FIGHTER',     'SPACECRAFT', 2),
(3, 'Hammerhead 2', 'hamm2',    'Cygnia Corporation',   2157, 219, 456, 2999999, 'SCOUT',       'SPACECRAFT', 3),
(4, 'Vanguard SAR', 'vanguard', 'Cygnia Corporation',   2157, 219, 456, 1900000, 'BOMBER',      'SPACECRAFT', 4),
(5, 'Tellus R X5',  'tellrx5',  'Cygnia Corporation',   2157, 219, 456, 5000000, 'SUPPORT',     'SPACECRAFT', 5);

INSERT INTO spacecraft_upgrade (id, name, upgrade_registry, spacecraft_registry, manufacturer, price, type, gain) VALUES
(1,  'Gentec FF Fieler',             'drax22_stabilizer',   'drax22',   'Gentech MIL Corp.',  100000, 'STABILIZER', 24),
(2,  'Alpha-stream Enhancer MKI',    'drax22_engine',       'drax22',   'ANTEC Laboratories', 500000, 'ENGINE',     20),
(3,  'Crystalin Turret',             'drax22_weapon',       'drax22',   'Gentech MIL Corp.',  500000, 'WEAPON',     27),
(4,  'Cylino BEAM-CBE',              'cygf35_weapons',      'cygf35',   'Cryson & Billard',   800000, 'WEAPON',     21),
(5,  'Cryson Particle Booster IA-2', 'cygf35_stabilizer',   'cygf35',   'Cryson & Billard',   200000, 'STABILIZER', 52),
(6,  'Shield Aggregator AUT1',       'cygf35_deflector',    'cygf35',   'Epsilon-X Labs',     350000, 'DEFLECTOR',  10),
(7,  'Sungrazer MOD-1',              'tellrx5_engine',      'tellrx5',  'Pritech Industries', 420000, 'ENGINE',     52),
(8,  'GXX Ion-tracker',              'tellrx5_stabilizer',  'tellrx5',  'Pritech Industries', 390000, 'STABILIZER', 52),
(9,  'Advanced Weapons System',      'tellrx5_weapons',     'tellrx5',  'Cryson & Billard',   560000, 'WEAPON',     52),
(10, 'Precision DEX-Wing',           'hamm2_stabilizer',    'hamm2',    'Pratney Mechanical', 790500, 'STABILIZER', 52),
(11, 'Craft Lazer MIL22',            'hamm2_weapons',       'hamm2',    'Pratney Mechanical', 810000, 'WEAPON',     52),
(12, 'Pratney Shield Generator',     'hamm2_deflector',     'hamm2',    'Cygnia Corporation', 390100, 'DEFLECTOR',  52),
(13, 'Gentec Puls Dampener',         'hamm2_deflector',     'hamm2',    'Gentech MIL Corp.',  370500, 'DEFLECTOR',  16),
(14, 'Alpha-stream Enhancer BX-22',  'vanguard_engine',     'vanguard', 'Epsilon-X Labs',     410200, 'ENGINE',     52),
(15, 'GXS Ion-subductor',            'vanguard_stabilizer', 'vanguard', 'ANTEC Laboratories', 133700, 'STABILIZER', 52),
(16, 'Gatling-rail enforcer',        'vanguard_weapons',    'vanguard', 'ANTEC Laboratories', 390400, 'WEAPON',     52),
(17, 'Tritinum-Boron plating',       'vanguard_plating',    'vanguard', 'Gentech MIL Corp.',  412000, 'PLATING',    52);


