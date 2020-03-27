TRUNCATE TABLE t_users;
TRUNCATE TABLE t_categories;
TRUNCATE TABLE t_videos;

INSERT INTO t_users (username, password, is_admin)
VALUES 
	('idan', 'idan', 'true'),
	('goni', 'goni', 'false');
	
INSERT INTO t_categories (category_name)
VALUES
	('Strategies'),
	('Exmaples'),
	('Other');
	
INSERT INTO t_videos (category_id, title, description, yt_link)
VALUES
	(1, 'First video', 'This is the first video', 'https://www.youtube.com/watch?v=q6EoRBvdVPQ&list=PLFsQleAWXsj_4yDeebiIADdH5FMayBiJo'),
	(3, 'Second video', 'This is the second video', 'https://www.youtube.com/watch?v=cuNhfSM-144&list=PLFsQleAWXsj_4yDeebiIADdH5FMayBiJo&index=4'),
	(2, 'Third video', 'This is the third video', 'https://www.youtube.com/watch?v=32nkdvLq3oQ&list=PLFsQleAWXsj_4yDeebiIADdH5FMayBiJo&index=9'),
	(1, 'Fourth video', 'This is the Fourth video', 'https://www.youtube.com/watch?v=q6EoRBvdVPQ&list=PLFsQleAWXsj_4yDeebiIADdH5FMayBiJo'),
	(3, 'Fifth video', 'This is the Fifth video', 'https://www.youtube.com/watch?v=cuNhfSM-144&list=PLFsQleAWXsj_4yDeebiIADdH5FMayBiJo&index=4'),
	(2, 'Sixth video', 'This is the Sixth video', 'https://www.youtube.com/watch?v=32nkdvLq3oQ&list=PLFsQleAWXsj_4yDeebiIADdH5FMayBiJo&index=9'),
	(1, 'Seventh video', 'This is the Seventh video', 'https://www.youtube.com/watch?v=q6EoRBvdVPQ&list=PLFsQleAWXsj_4yDeebiIADdH5FMayBiJo'),
	(3, 'Eighth video', 'This is the Eighth video', 'https://www.youtube.com/watch?v=cuNhfSM-144&list=PLFsQleAWXsj_4yDeebiIADdH5FMayBiJo&index=4'),
	(2, 'Ninth video', 'This is the Ninth video', 'https://www.youtube.com/watch?v=32nkdvLq3oQ&list=PLFsQleAWXsj_4yDeebiIADdH5FMayBiJo&index=9'),
	(3, 'Tenth video', 'This is the Tenth video', 'https://www.youtube.com/watch?v=q6EoRBvdVPQ&list=PLFsQleAWXsj_4yDeebiIADdH5FMayBiJo'),
	(3, 'Elventh video', 'This is the Elventh video', 'https://www.youtube.com/watch?v=cuNhfSM-144&list=PLFsQleAWXsj_4yDeebiIADdH5FMayBiJo&index=4'),
	(2, 'Twelvth video', 'This is the Twelvth video', 'https://www.youtube.com/watch?v=32nkdvLq3oQ&list=PLFsQleAWXsj_4yDeebiIADdH5FMayBiJo&index=9');
	
	
commit;
	 