-- Dane startowe aplikacji. Tabele tworzy Hibernate z encji, a ten plik Spring Boot uruchamia zaraz potem.
-- LAB 01: dopiszcie tu konta wszystkich osób z zespołu (reguła R1.03).
-- LAB 02: dopiszcie dane do swoich tabel (kolejność: najpierw tabele, na które wskazują klucze obce).
insert into user_account (email, display_name, role, created_at) values
    ('ola@student.merito.pl',   'Ola',   'USER',    current_timestamp),
    ('kuba@student.merito.pl',  'Kuba',  'USER',    current_timestamp),
    ('firma@example.com',       'Firma', 'PARTNER', current_timestamp),
    ('admin@example.com',       'Admin', 'ADMIN',   current_timestamp),
    ('s200122@student.wroclaw.merito.pl',   'Damian',   'USER',    current_timestamp),
    ('s281469@student.wroclaw.merito.pl',  'Jakub',  'USER',    current_timestamp),
    ('wrx82055@student.wroclaw.merito.pl',       'Szymon', 'USER', current_timestamp);

-- LAB 01: Wasze konta (zmieńcie na swoje dane, rola USER)
-- insert into user_account (email, display_name, role, created_at) values
--     ('imie.nazwisko@student.merito.pl', 'Imię', 'USER', current_timestamp);

INSERT INTO artists (artist_name, artist_genre, artist_followers_count, created_at) VALUES
    ('The Weeknd',   'Synth-pop',         85000000, current_timestamp),
    ('Dua Lipa',     'Pop',               70000000, current_timestamp),
    ('Linkin Park',  'Alternative Rock',  55000000, current_timestamp);


INSERT INTO artist_albums (album_title, artist_id, release_date, track_count) VALUES
    ('After Hours',       1, '2020-03-20', 14),
    ('Future Nostalgia',  2, '2020-03-27', 11),
    ('Hybrid Theory',     3, '2000-10-24', 12);

INSERT INTO tracks (track_id, title, album_id, duration_ms, popularity) VALUES
    (101, 'Blinding Lights',   1, 200040, 95),
    (102, 'Save Your Tears',   1, 215626, 90),
    (201, 'Levitating',        2, 203064, 92),
    (301, 'In the End',        3, 216893, 88);