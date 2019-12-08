INSERT INTO `topflies`.`season`
(`created_by`,
 `created_date`,
 `updated_by`,
 `updated_date`,
 `version`,
 `season_id`,
 `name`)
VALUES
("mtbittle", current_timestamp(), "mtbittle", current_timestamp(), 1, 1, "Spring"),
("mtbittle", current_timestamp(), "mtbittle", current_timestamp(), 1, 2, "Summer"),
("mtbittle", current_timestamp(), "mtbittle", current_timestamp(), 1, 3, "Fall"),
("mtbittle", current_timestamp(), "mtbittle", current_timestamp(), 1, 4, "Winter");

INSERT INTO topflies.state (created_by, created_date, updated_by, updated_date, version, abbreviation, name)
VALUES
("mtbittle", current_timestamp(), "mtbittle", current_timestamp(), 1,  "AL", "Alabama"),
("mtbittle", current_timestamp(), "mtbittle", current_timestamp(), 1,  "AK", "Alaska"),
("mtbittle", current_timestamp(), "mtbittle", current_timestamp(), 1,  "AR", "Arkansas"),
("mtbittle", current_timestamp(), "mtbittle", current_timestamp(), 1,  "AZ", "Arizona"),
("mtbittle", current_timestamp(), "mtbittle", current_timestamp(), 1,  "CA", "California"),
("mtbittle", current_timestamp(), "mtbittle", current_timestamp(), 1,  "CO", "Colorado"),
("mtbittle", current_timestamp(), "mtbittle", current_timestamp(), 1,  "CT", "Connecticut"),
("mtbittle", current_timestamp(), "mtbittle", current_timestamp(), 1,  "DE", "Deleware"),
("mtbittle", current_timestamp(), "mtbittle", current_timestamp(), 1,  "FL", "Florida"),
("mtbittle", current_timestamp(), "mtbittle", current_timestamp(), 1,  "GA", "Georgia"),
("mtbittle", current_timestamp(), "mtbittle", current_timestamp(), 1,  "HI", "Hawaii"),
("mtbittle", current_timestamp(), "mtbittle", current_timestamp(), 1,  "ID", "Idaho"),
("mtbittle", current_timestamp(), "mtbittle", current_timestamp(), 1,  "IL", "Illinois"),
("mtbittle", current_timestamp(), "mtbittle", current_timestamp(), 1,  "IN", "Indiana"),
("mtbittle", current_timestamp(), "mtbittle", current_timestamp(), 1,  "IA", "Iowa"),
("mtbittle", current_timestamp(), "mtbittle", current_timestamp(), 1,  "KS", "Kansas"),
("mtbittle", current_timestamp(), "mtbittle", current_timestamp(), 1,  "KY", "Kentucky"),
("mtbittle", current_timestamp(), "mtbittle", current_timestamp(), 1,  "LA", "Louisiana"),
("mtbittle", current_timestamp(), "mtbittle", current_timestamp(), 1,  "ME", "Maine"),
("mtbittle", current_timestamp(), "mtbittle", current_timestamp(), 1,  "MD", "Maryland"),
("mtbittle", current_timestamp(), "mtbittle", current_timestamp(), 1,  "MA", "Massachusetts"),
("mtbittle", current_timestamp(), "mtbittle", current_timestamp(), 1,  "MI", "Michican"),
("mtbittle", current_timestamp(), "mtbittle", current_timestamp(), 1,  "MN", "Minnesota"),
("mtbittle", current_timestamp(), "mtbittle", current_timestamp(), 1,  "MS", "Mississippi"),
("mtbittle", current_timestamp(), "mtbittle", current_timestamp(), 1,  "MO", "Missouri"),
("mtbittle", current_timestamp(), "mtbittle", current_timestamp(), 1,  "MT", "Montana"),
("mtbittle", current_timestamp(), "mtbittle", current_timestamp(), 1,  "NE", "Nebraska"),
("mtbittle", current_timestamp(), "mtbittle", current_timestamp(), 1,  "NV", "Nevada"),
("mtbittle", current_timestamp(), "mtbittle", current_timestamp(), 1,  "NH", "New Hampshire"),
("mtbittle", current_timestamp(), "mtbittle", current_timestamp(), 1,  "NJ", "New Jersey"),
("mtbittle", current_timestamp(), "mtbittle", current_timestamp(), 1,  "NM", "New Mexico"),
("mtbittle", current_timestamp(), "mtbittle", current_timestamp(), 1,  "NY", "New York"),
("mtbittle", current_timestamp(), "mtbittle", current_timestamp(), 1,  "NC", "North Carolina"),
("mtbittle", current_timestamp(), "mtbittle", current_timestamp(), 1,  "ND", "North Dakota"),
("mtbittle", current_timestamp(), "mtbittle", current_timestamp(), 1,  "OH", "Ohio"),
("mtbittle", current_timestamp(), "mtbittle", current_timestamp(), 1,  "OK", "Oklahoma"),
("mtbittle", current_timestamp(), "mtbittle", current_timestamp(), 1,  "OR", "Oregon"),
("mtbittle", current_timestamp(), "mtbittle", current_timestamp(), 1,  "PA", "Pennsylvania"),
("mtbittle", current_timestamp(), "mtbittle", current_timestamp(), 1,  "RI", "Rhode Island"),
("mtbittle", current_timestamp(), "mtbittle", current_timestamp(), 1,  "SC", "South Carolina"),
("mtbittle", current_timestamp(), "mtbittle", current_timestamp(), 1,  "SD", "South Dakota"),
("mtbittle", current_timestamp(), "mtbittle", current_timestamp(), 1,  "TN", "Tennessee"),
("mtbittle", current_timestamp(), "mtbittle", current_timestamp(), 1,  "TX", "Texas"),
("mtbittle", current_timestamp(), "mtbittle", current_timestamp(), 1,  "UT", "Utah"),
("mtbittle", current_timestamp(), "mtbittle", current_timestamp(), 1,  "VT", "Vermont"),
("mtbittle", current_timestamp(), "mtbittle", current_timestamp(), 1,  "VA", "Virginia"),
("mtbittle", current_timestamp(), "mtbittle", current_timestamp(), 1,  "WA", "Washington"),
("mtbittle", current_timestamp(), "mtbittle", current_timestamp(), 1,  "WV", "West Virginia"),
("mtbittle", current_timestamp(), "mtbittle", current_timestamp(), 1,  "WI", "Wisconsin"),
("mtbittle", current_timestamp(), "mtbittle", current_timestamp(), 1,  "WY", "Wyoming");

INSERT INTO topflies.fly_type(fly_type_id, name, version, created_by, created_date, updated_by, updated_date)
VALUES
(1, "Dry", 1, "mtbittle", current_timestamp(), "mtbittle", current_timestamp()),
(2, "Wet", 1, "mtbittle", current_timestamp(), "mtbittle", current_timestamp()),
(3, "Streamer", 1, "mtbittle", current_timestamp(), "mtbittle", current_timestamp()),
(4, "Popper", 1, "mtbittle", current_timestamp(), "mtbittle", current_timestamp());

INSERT INTO topflies.region(region_id, name, version, created_by, created_date, updated_by, updated_date)
VALUES
(1, "Pacific Northwest", 1, "mtbittle", current_timestamp(), "mtbittle", current_timestamp()),
(2, "Mountain West", 1, "mtbittle", current_timestamp(), "mtbittle", current_timestamp()),
(3, "Midwest - Central", 1, "mtbittle", current_timestamp(), "mtbittle", current_timestamp()),
(4, "Midwest - North", 1, "mtbittle", current_timestamp(), "mtbittle", current_timestamp()),
(5, "New England", 1, "mtbittle", current_timestamp(), "mtbittle", current_timestamp()),
(6, "Mid-Atlantic", 1, "mtbittle", current_timestamp(), "mtbittle", current_timestamp()),
(7, "South Atlantic", 1, "mtbittle", current_timestamp(), "mtbittle", current_timestamp()),
(8, "Southeast", 1, "mtbittle", current_timestamp(), "mtbittle", current_timestamp()),
(9, "Southwest", 1, "mtbittle", current_timestamp(), "mtbittle", current_timestamp());

INSERT INTO topflies.river (river_id, name, version, region_id, created_by, created_date, updated_by, updated_date)
VALUES
(1, "Deschutes", 1, 1, "mtbittle", current_timestamp(), "mtbittle", current_timestamp());