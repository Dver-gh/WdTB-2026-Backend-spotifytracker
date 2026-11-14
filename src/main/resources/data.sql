insert into user_account (email, display_name, role, created_at) values
    ('ola@student.merito.pl',   'Ola',   'USER',    current_timestamp),
    ('kuba@student.merito.pl',  'Kuba',  'USER',    current_timestamp),
    ('firma@example.com',       'Firma', 'PARTNER', current_timestamp),
    ('admin@example.com',       'Admin', 'ADMIN',   current_timestamp),
    ('s200122@student.wroclaw.merito.pl',   'Damian',   'USER',    current_timestamp),
    ('s281469@student.wroclaw.merito.pl',  'Jakub',  'USER',    current_timestamp),
    ('wrx82055@student.wroclaw.merito.pl',       'Szymon', 'USER', current_timestamp);

INSERT INTO artists (artist_name, artist_genre, artist_followers_count, created_at) VALUES
    ('The Weeknd',   'Synth-pop',         85000000, current_timestamp),
    ('Dua Lipa',     'Pop',               70000000, current_timestamp),
    ('Linkin Park',  'Alternative Rock',  55000000, current_timestamp);

INSERT INTO artist_albums (album_title, artist_id, release_date, track_count, album_type) VALUES
    ('After Hours',       1, '2020-03-20', 14, 'ALBUM'),
    ('Future Nostalgia',  2, '2020-03-27', 11, 'ALBUM'),
    ('Hybrid Theory',     3, '2000-10-24', 12, 'ALBUM');

INSERT INTO tracks (track_id, title, album_id, duration_ms, popularity, bpm, musical_key) VALUES
    (101, 'Blinding Lights',   1, 200040, 95, 171, 'C#min'),
    (102, 'Save Your Tears',   1, 215626, 90, 118, 'C#maj'),
    (201, 'Levitating',        2, 203064, 92, 103, 'Bmin'),
    (301, 'In the End',        3, 216893, 88,  85, 'F#min');

INSERT INTO listener (user_account_id, display_handle, favorite_genre, country, joined_at) VALUES
    (5, 'damian_fm',  'Synth-pop',        'PL', current_timestamp),
    (6, 'kuba_beats', 'Pop',              'PL', current_timestamp),
    (7, 'szymon_rx',  'Alternative Rock', 'PL', current_timestamp);

INSERT INTO favorite_track (listener_id, track_id, added_at, play_count) VALUES
    (1, 1, current_timestamp, 42),
    (1, 3, current_timestamp, 17),
    (2, 1, current_timestamp,  8),
    (3, 4, current_timestamp, 95);
