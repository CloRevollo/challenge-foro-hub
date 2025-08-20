CREATE TABLE perfiles (
                          id BIGINT AUTO_INCREMENT PRIMARY KEY,
                          nombre VARCHAR(255) NOT NULL
);

CREATE TABLE usuarios (
                          id BIGINT AUTO_INCREMENT PRIMARY KEY,
                          nombre VARCHAR(255) NOT NULL,
                          correo VARCHAR(255) UNIQUE NOT NULL,
                          password VARCHAR(255) NOT NULL,
                          perfiles_id BIGINT,
                          CONSTRAINT fk_usuario_perfil FOREIGN KEY (perfiles_id) REFERENCES perfiles(id)
);

CREATE TABLE cursos (
                        id BIGINT AUTO_INCREMENT PRIMARY KEY,
                        nombre VARCHAR(255) NOT NULL,
                        categoria VARCHAR(255) NOT NULL
);

CREATE TABLE topicos (
                         id BIGINT AUTO_INCREMENT PRIMARY KEY,
                         titulo VARCHAR(255) NOT NULL UNIQUE,
                         mensaje TEXT NOT NULL,
                         fecha DATETIME NOT NULL,
                         status VARCHAR(50),
                         curso_id BIGINT,
                         usuario_id BIGINT,
                         CONSTRAINT fk_topico_curso FOREIGN KEY (curso_id) REFERENCES cursos(id),
                         CONSTRAINT fk_topico_usuario FOREIGN KEY (usuario_id) REFERENCES usuarios(id),
                         UNIQUE KEY uq_mensaje (mensaje(255))
);

CREATE TABLE respuestas (
                            id BIGINT AUTO_INCREMENT PRIMARY KEY,
                            mensaje TEXT NOT NULL,
                            fecha_creacion DATETIME NOT NULL,
                            solucion VARCHAR(50),
                            topico_id BIGINT,
                            usuario_id BIGINT,
                            CONSTRAINT fk_respuesta_topico FOREIGN KEY (topico_id) REFERENCES topicos(id),
                            CONSTRAINT fk_respuesta_usuario FOREIGN KEY (usuario_id) REFERENCES usuarios(id)
);
