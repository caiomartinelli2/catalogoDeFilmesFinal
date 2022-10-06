--
-- PostgreSQL database dump
--

-- Dumped from database version 14.5
-- Dumped by pg_dump version 14.5

-- Started on 2022-10-06 15:16:14

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- TOC entry 212 (class 1259 OID 16699)
-- Name: ator; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.ator (
    cod_ator integer NOT NULL,
    nome_ator character varying,
    cod_pais integer
);


ALTER TABLE public.ator OWNER TO postgres;

--
-- TOC entry 210 (class 1259 OID 16662)
-- Name: diretor; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.diretor (
    cod_diretor integer NOT NULL,
    nome_diretor character varying,
    cod_pais integer
);


ALTER TABLE public.diretor OWNER TO postgres;

--
-- TOC entry 214 (class 1259 OID 16765)
-- Name: filme; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.filme (
    cod_filme integer NOT NULL,
    nome_filme character varying,
    duracao double precision,
    sinopse character varying,
    cod_pais integer,
    cod_genero integer,
    cod_diretor integer,
    cod_roteirista integer
);


ALTER TABLE public.filme OWNER TO postgres;

--
-- TOC entry 215 (class 1259 OID 16792)
-- Name: filme_ator; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.filme_ator (
    cod_filme integer,
    cod_ator integer
);


ALTER TABLE public.filme_ator OWNER TO postgres;

--
-- TOC entry 213 (class 1259 OID 16711)
-- Name: genero; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.genero (
    cod_genero integer NOT NULL,
    nome_genero character varying
);


ALTER TABLE public.genero OWNER TO postgres;

--
-- TOC entry 209 (class 1259 OID 16647)
-- Name: pais; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.pais (
    cod_pais integer NOT NULL,
    nome_pais character varying(50)
);


ALTER TABLE public.pais OWNER TO postgres;

--
-- TOC entry 211 (class 1259 OID 16687)
-- Name: roteirista; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.roteirista (
    cod_roteirista integer NOT NULL,
    nome_roteirista character varying,
    cod_pais integer
);


ALTER TABLE public.roteirista OWNER TO postgres;

--
-- TOC entry 3350 (class 0 OID 16699)
-- Dependencies: 212
-- Data for Name: ator; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.ator VALUES (1, 'Robert Downey Jr.', 3);
INSERT INTO public.ator VALUES (2, 'Brie Larson', 3);
INSERT INTO public.ator VALUES (3, 'Benedict Cumberbath', 2);
INSERT INTO public.ator VALUES (4, 'Tom Holland', 3);
INSERT INTO public.ator VALUES (5, 'Samuel Jackson ', 3);
INSERT INTO public.ator VALUES (7, 'Edward Norton ', 3);
INSERT INTO public.ator VALUES (8, 'Brad Pitt', 3);
INSERT INTO public.ator VALUES (9, 'Will Smith ', 3);
INSERT INTO public.ator VALUES (10, 'Jaden Smith', 3);
INSERT INTO public.ator VALUES (11, 'Morgan Freeman', 3);
INSERT INTO public.ator VALUES (12, 'Tim Robbins ', 2);


--
-- TOC entry 3348 (class 0 OID 16662)
-- Dependencies: 210
-- Data for Name: diretor; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.diretor VALUES (1, 'Russos Brothers', 3);
INSERT INTO public.diretor VALUES (2, 'David Fincher', 3);
INSERT INTO public.diretor VALUES (3, 'Gabriele Muccino ', 6);
INSERT INTO public.diretor VALUES (4, 'Jon Watts', 3);
INSERT INTO public.diretor VALUES (5, 'Scott Derrickson ', 3);
INSERT INTO public.diretor VALUES (6, 'Frank Darabont', 4);
INSERT INTO public.diretor VALUES (7, 'Guy Ritchie', 2);
INSERT INTO public.diretor VALUES (8, 'Jon Favreau 3', 3);
INSERT INTO public.diretor VALUES (9, 'Chris Sanders', 3);
INSERT INTO public.diretor VALUES (10, 'Anna Boden', 3);


--
-- TOC entry 3352 (class 0 OID 16765)
-- Dependencies: 214
-- Data for Name: filme; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.filme VALUES (1, 'Vingadores Ultimato', 181, 'Filme da marvel', 3, 5, 1, 1);
INSERT INTO public.filme VALUES (2, 'Clube da luta', 139, 'Um homem que sofre de ins“nia conhece um estranho', 3, 2, 2, 2);
INSERT INTO public.filme VALUES (3, 'A Procura da felicidade', 117, 'Chris enfrenta s‚rios problemas financeiros ', 3, 4, 3, 3);
INSERT INTO public.filme VALUES (4, 'Homem-Aranha 3', 148, 'Homem aranha lida com as consequecias da sua identidade ser descoberta', 3, 5, 4, 4);
INSERT INTO public.filme VALUES (5, 'Doutor Estranho', 115, 'Apos sua carreira ser destruida, Stephen tem uma nova chance ', 3, 5, 5, 5);
INSERT INTO public.filme VALUES (6, 'Um sonho de liberdade', 142, 'Andy e condenado injustamente a prisao perpetua', 3, 4, 6, 6);
INSERT INTO public.filme VALUES (7, 'Sherlock Holmes', 128, 'O detetive Sherlock precisa devendar o responsavel por diversos crimes', 2, 2, 7, 7);
INSERT INTO public.filme VALUES (8, 'Homem de Ferro 1', 126, 'Tony Stark e sequestrado e precisa construir uma armadura para escapar', 3, 5, 8, 8);
INSERT INTO public.filme VALUES (9, 'Como treinar o seu dragao', 98, 'Solu‡o um jovem viking encontra um dragao perdido', 3, 3, 8, 8);
INSERT INTO public.filme VALUES (10, 'Capita Marvel', 124, 'Capita Marvel impede a invasao Kree na terra', 3, 5, 10, 10);


--
-- TOC entry 3353 (class 0 OID 16792)
-- Dependencies: 215
-- Data for Name: filme_ator; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.filme_ator VALUES (1, 1);
INSERT INTO public.filme_ator VALUES (7, 1);
INSERT INTO public.filme_ator VALUES (8, 1);
INSERT INTO public.filme_ator VALUES (1, 2);
INSERT INTO public.filme_ator VALUES (10, 2);
INSERT INTO public.filme_ator VALUES (1, 3);
INSERT INTO public.filme_ator VALUES (4, 3);
INSERT INTO public.filme_ator VALUES (5, 3);
INSERT INTO public.filme_ator VALUES (1, 4);
INSERT INTO public.filme_ator VALUES (4, 4);
INSERT INTO public.filme_ator VALUES (10, 5);
INSERT INTO public.filme_ator VALUES (2, 7);
INSERT INTO public.filme_ator VALUES (2, 8);
INSERT INTO public.filme_ator VALUES (3, 9);
INSERT INTO public.filme_ator VALUES (3, 10);
INSERT INTO public.filme_ator VALUES (6, 11);
INSERT INTO public.filme_ator VALUES (6, 12);


--
-- TOC entry 3351 (class 0 OID 16711)
-- Dependencies: 213
-- Data for Name: genero; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.genero VALUES (1, 'Acao');
INSERT INTO public.genero VALUES (2, 'Suspense');
INSERT INTO public.genero VALUES (3, 'Aventura');
INSERT INTO public.genero VALUES (4, 'Drama');
INSERT INTO public.genero VALUES (5, 'Super-Heroi');


--
-- TOC entry 3347 (class 0 OID 16647)
-- Dependencies: 209
-- Data for Name: pais; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.pais VALUES (1, 'Brasil');
INSERT INTO public.pais VALUES (2, 'Inglaterra');
INSERT INTO public.pais VALUES (4, 'Fran‡a');
INSERT INTO public.pais VALUES (5, 'Dinamarca');
INSERT INTO public.pais VALUES (3, 'EUA');
INSERT INTO public.pais VALUES (6, 'Italia');


--
-- TOC entry 3349 (class 0 OID 16687)
-- Dependencies: 211
-- Data for Name: roteirista; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.roteirista VALUES (1, 'Cristopher Marks', 3);
INSERT INTO public.roteirista VALUES (2, 'Jim Uhls', 3);
INSERT INTO public.roteirista VALUES (3, 'Steven Conrad', 3);
INSERT INTO public.roteirista VALUES (4, 'Chris McKenna', 3);
INSERT INTO public.roteirista VALUES (5, 'Jon Spaihts', 3);
INSERT INTO public.roteirista VALUES (6, 'Stephen King', 3);
INSERT INTO public.roteirista VALUES (7, 'Simon Kinberg', 2);
INSERT INTO public.roteirista VALUES (8, 'Mark Fergus', 3);
INSERT INTO public.roteirista VALUES (9, 'William Davies', 2);
INSERT INTO public.roteirista VALUES (10, 'Ryan Fleck', 3);


--
-- TOC entry 3194 (class 2606 OID 16705)
-- Name: ator cod_ator; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.ator
    ADD CONSTRAINT cod_ator PRIMARY KEY (cod_ator);


--
-- TOC entry 3190 (class 2606 OID 16668)
-- Name: diretor cod_diretor; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.diretor
    ADD CONSTRAINT cod_diretor PRIMARY KEY (cod_diretor);


--
-- TOC entry 3198 (class 2606 OID 16771)
-- Name: filme cod_filme; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.filme
    ADD CONSTRAINT cod_filme PRIMARY KEY (cod_filme);


--
-- TOC entry 3196 (class 2606 OID 16717)
-- Name: genero genero_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.genero
    ADD CONSTRAINT genero_pkey PRIMARY KEY (cod_genero);


--
-- TOC entry 3188 (class 2606 OID 16661)
-- Name: pais pais_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.pais
    ADD CONSTRAINT pais_pkey PRIMARY KEY (cod_pais);


--
-- TOC entry 3192 (class 2606 OID 16693)
-- Name: roteirista roteirista_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.roteirista
    ADD CONSTRAINT roteirista_pkey PRIMARY KEY (cod_roteirista);


--
-- TOC entry 3207 (class 2606 OID 16800)
-- Name: filme_ator cod_ator; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.filme_ator
    ADD CONSTRAINT cod_ator FOREIGN KEY (cod_ator) REFERENCES public.ator(cod_ator);


--
-- TOC entry 3204 (class 2606 OID 16782)
-- Name: filme cod_diretor; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.filme
    ADD CONSTRAINT cod_diretor FOREIGN KEY (cod_diretor) REFERENCES public.diretor(cod_diretor);


--
-- TOC entry 3206 (class 2606 OID 16795)
-- Name: filme_ator cod_filme; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.filme_ator
    ADD CONSTRAINT cod_filme FOREIGN KEY (cod_filme) REFERENCES public.filme(cod_filme);


--
-- TOC entry 3203 (class 2606 OID 16777)
-- Name: filme cod_genero; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.filme
    ADD CONSTRAINT cod_genero FOREIGN KEY (cod_genero) REFERENCES public.genero(cod_genero);


--
-- TOC entry 3199 (class 2606 OID 16669)
-- Name: diretor cod_pais; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.diretor
    ADD CONSTRAINT cod_pais FOREIGN KEY (cod_pais) REFERENCES public.pais(cod_pais);


--
-- TOC entry 3200 (class 2606 OID 16694)
-- Name: roteirista cod_pais; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.roteirista
    ADD CONSTRAINT cod_pais FOREIGN KEY (cod_pais) REFERENCES public.pais(cod_pais);


--
-- TOC entry 3201 (class 2606 OID 16706)
-- Name: ator cod_pais; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.ator
    ADD CONSTRAINT cod_pais FOREIGN KEY (cod_pais) REFERENCES public.pais(cod_pais) NOT VALID;


--
-- TOC entry 3202 (class 2606 OID 16772)
-- Name: filme cod_pais; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.filme
    ADD CONSTRAINT cod_pais FOREIGN KEY (cod_pais) REFERENCES public.pais(cod_pais);


--
-- TOC entry 3205 (class 2606 OID 16787)
-- Name: filme cod_roteirista; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.filme
    ADD CONSTRAINT cod_roteirista FOREIGN KEY (cod_roteirista) REFERENCES public.roteirista(cod_roteirista);


-- Completed on 2022-10-06 15:16:15

--
-- PostgreSQL database dump complete
--

