
-- Tabella Linee
CREATE TABLE Linee (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    tipo VARCHAR(50) NOT NULL
);

-- Tabella Stazioni
CREATE TABLE Stazioni (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    citta VARCHAR(100),
    latitudine DECIMAL(9,6),
    longitudine DECIMAL(9,6),
    attrazioni_turistiche VARCHAR(100)
);

-- Tabella Treni
CREATE TABLE Treni (
    id INT AUTO_INCREMENT PRIMARY KEY,
    modello VARCHAR(100),
    capacita INT,
    id_linea INT,
    FOREIGN KEY (id_linea) REFERENCES Linee(id)
);

-- Tabella Fermate
CREATE TABLE Fermate (
    id INT AUTO_INCREMENT PRIMARY KEY,
    id_treno INT,
    id_stazione INT,
    orario_arrivo TIME,
    orario_partenza TIME,
    ritardo_minuti INT DEFAULT 0,
    FOREIGN KEY (id_stazione) REFERENCES Stazioni(id)
);

-- Inserimento Linee
INSERT INTO Linee (nome, tipo) VALUES
('Napoli – Sorrento', 'Circumvesuviana'),
('Napoli – Baiano', 'Circumvesuviana'),
('Cumana', 'Flegrea'),
('Circumflegrea', 'Flegrea'),
('Napoli – Benevento', 'Suburbana');

-- Inserimento Stazioni (esempi con coordinate e attrazioni)
INSERT INTO Stazioni (nome, citta, latitudine, longitudine, attrazioni_turistiche) VALUES
('Napoli Porta Nolana', 'Napoli', 40.846700, 14.270000, 'Centro storico di Napoli'),
('Ercolano Scavi', 'Ercolano', 40.806100, 14.348300, 'Scavi archeologici di Ercolano'),
('Pompei Scavi – Villa dei Misteri', 'Pompei', 40.750400, 14.486900, 'Scavi di Pompei, Villa dei Misteri'),
('Sorrento', 'Sorrento', 40.626300, 14.375800, 'Centro storico di Sorrento, Marina Grande'),
('Napoli Montesanto', 'Napoli', 40.846000, 14.241000, 'Quartieri Spagnoli, Funicolare di Montesanto'),
('Pozzuoli', 'Pozzuoli', 40.827500, 14.122800, 'Tempio di Serapide, Anfiteatro Flavio'),
('Baiano', 'Baiano', 40.951000, 14.589000, 'Centro storico di Baiano'),
('Licola', 'Giugliano in Campania', 40.867000, 14.050000, 'Parco archeologico di Cuma'),
('Benevento Appia', 'Benevento', 41.129000, 14.781000, 'Arco di Traiano, Teatro Romano'),
('Campi Flegrei', 'Napoli', 40.827000, 14.193000, 'Stadio Diego Armando Maradona, Mostra d_Oltremare');

-- Inserimento Treni
INSERT INTO Treni (modello, capacita, id_linea) VALUES
('ETR 200', 300, 1),
('ETR 201', 280, 2),
('CAF UDT', 250, 3),
('TFA 100', 260, 4),
('ALn 668', 200, 5),
('ETR 202', 320, 1);

-- Inserimento Fermate (esempi)
INSERT INTO Fermate (id_treno, id_stazione, orario_arrivo, orario_partenza) VALUES
(1, 1, '08:00:00', '08:02:00'),
(1, 2, '08:20:00', '08:22:00'),
(1, 3, '08:40:00', '08:42:00'),
(1, 4, '09:00:00', '09:05:00'),
(3, 5, '07:30:00', '07:32:00'),
(3, 6, '07:50:00', '07:52:00'),
(2, 7, '08:10:00', '08:12:00'),
(4, 8, '09:15:00', '09:17:00'),
(5, 9, '10:00:00', '10:02:00'),
(3, 10, '07:45:00', '07:47:00');

-- Inserimenti aggiuntivi
INSERT INTO Treni (modello, capacita, id_linea) VALUES ('ETR 245', 400, 1);
INSERT INTO Treni (modello, capacita, id_linea) VALUES ('ETR 500', 450, 2);
INSERT INTO Treni (modello, capacita, id_linea) VALUES ('Jazz 2.0', 300, 3);
INSERT INTO Treni (modello, capacita, id_linea) VALUES ('Minuetto', 250, 4);
INSERT INTO Treni (modello, capacita, id_linea) VALUES ('Pop 3', 350, 5);
INSERT INTO Fermate (id_treno, id_stazione, orario_arrivo, orario_partenza, ritardo_minuti) VALUES (7, 1, '08:15:00', '08:17:00', 0);
INSERT INTO Fermate (id_treno, id_stazione, orario_arrivo, orario_partenza, ritardo_minuti) VALUES (7, 5, '08:45:00', '08:47:00', 3);
INSERT INTO Fermate (id_treno, id_stazione, orario_arrivo, orario_partenza, ritardo_minuti) VALUES (8, 10, '09:00:00', '09:02:00', 0);
INSERT INTO Fermate (id_treno, id_stazione, orario_arrivo, orario_partenza, ritardo_minuti) VALUES (8, 2, '09:30:00', '09:32:00', 5);
INSERT INTO Fermate (id_treno, id_stazione, orario_arrivo, orario_partenza, ritardo_minuti) VALUES (9, 5, '10:00:00', '10:02:00', 0);
INSERT INTO Fermate (id_treno, id_stazione, orario_arrivo, orario_partenza, ritardo_minuti) VALUES (9, 8, '10:25:00', '10:27:00', 2);
INSERT INTO Fermate (id_treno, id_stazione, orario_arrivo, orario_partenza, ritardo_minuti) VALUES (10, 10, '11:00:00', '11:02:00', 0);
INSERT INTO Fermate (id_treno, id_stazione, orario_arrivo, orario_partenza, ritardo_minuti) VALUES (10, 2, '11:30:00', '11:32:00', 4);
INSERT INTO Fermate (id_treno, id_stazione, orario_arrivo, orario_partenza, ritardo_minuti) VALUES (11, 5, '12:00:00', '12:02:00', 0);
INSERT INTO Fermate (id_treno, id_stazione, orario_arrivo, orario_partenza, ritardo_minuti) VALUES (11, 8, '12:30:00', '12:32:00', 6);