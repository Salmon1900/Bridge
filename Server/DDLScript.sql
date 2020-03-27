DROP TABLE IF EXISTS t_categories;
DROP TABLE IF EXISTS t_users;
DROP TABLE IF EXISTS t_videos;

CREATE TABLE t_categories (
	category_id SERIAL PRIMARY KEY NOT NULL,
	category_name VARCHAR(30) NOT NULL
);

CREATE TABLE t_users (
	user_id SERIAL PRIMARY KEY NOT NULL,
	username VARCHAR (30) UNIQUE NOT NULL,
    password VARCHAR (30) NOT NULL,
	is_admin BOOLEAN DEFAULT 'false'
);

CREATE TABLE t_videos (
	video_id SERIAL PRIMARY KEY NOT NULL,
	category_id INTEGER NOT NULL,
	title VARCHAR(50) NOT NULL,
	description VARCHAR(160),
	yt_link VARCHAR(200) NOT NULL
);

COMMIT;