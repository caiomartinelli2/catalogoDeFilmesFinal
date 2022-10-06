PGDMP     	                	    z            CatalogoDeFilmes    14.5    14.5 !               0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false                       0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false                       0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false                       1262    16616    CatalogoDeFilmes    DATABASE     r   CREATE DATABASE "CatalogoDeFilmes" WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE = 'Portuguese_Brazil.1252';
 "   DROP DATABASE "CatalogoDeFilmes";
                postgres    false            �            1259    16699    ator    TABLE     s   CREATE TABLE public.ator (
    cod_ator integer NOT NULL,
    nome_ator character varying,
    cod_pais integer
);
    DROP TABLE public.ator;
       public         heap    postgres    false            �            1259    16662    diretor    TABLE     |   CREATE TABLE public.diretor (
    cod_diretor integer NOT NULL,
    nome_diretor character varying,
    cod_pais integer
);
    DROP TABLE public.diretor;
       public         heap    postgres    false            �            1259    16765    filme    TABLE        CREATE TABLE public.filme (
    cod_filme integer NOT NULL,
    nome_filme character varying,
    duracao double precision,
    sinopse character varying,
    cod_pais integer,
    cod_genero integer,
    cod_diretor integer,
    cod_roteirista integer
);
    DROP TABLE public.filme;
       public         heap    postgres    false            �            1259    16792 
   filme_ator    TABLE     P   CREATE TABLE public.filme_ator (
    cod_filme integer,
    cod_ator integer
);
    DROP TABLE public.filme_ator;
       public         heap    postgres    false            �            1259    16711    genero    TABLE     c   CREATE TABLE public.genero (
    cod_genero integer NOT NULL,
    nome_genero character varying
);
    DROP TABLE public.genero;
       public         heap    postgres    false            �            1259    16647    pais    TABLE     a   CREATE TABLE public.pais (
    cod_pais integer NOT NULL,
    nome_pais character varying(50)
);
    DROP TABLE public.pais;
       public         heap    postgres    false            �            1259    16687 
   roteirista    TABLE     �   CREATE TABLE public.roteirista (
    cod_roteirista integer NOT NULL,
    nome_roteirista character varying,
    cod_pais integer
);
    DROP TABLE public.roteirista;
       public         heap    postgres    false                      0    16699    ator 
   TABLE DATA           =   COPY public.ator (cod_ator, nome_ator, cod_pais) FROM stdin;
    public          postgres    false    212   i$                 0    16662    diretor 
   TABLE DATA           F   COPY public.diretor (cod_diretor, nome_diretor, cod_pais) FROM stdin;
    public          postgres    false    210   #%                 0    16765    filme 
   TABLE DATA           {   COPY public.filme (cod_filme, nome_filme, duracao, sinopse, cod_pais, cod_genero, cod_diretor, cod_roteirista) FROM stdin;
    public          postgres    false    214   �%                 0    16792 
   filme_ator 
   TABLE DATA           9   COPY public.filme_ator (cod_filme, cod_ator) FROM stdin;
    public          postgres    false    215   
(                 0    16711    genero 
   TABLE DATA           9   COPY public.genero (cod_genero, nome_genero) FROM stdin;
    public          postgres    false    213   U(                 0    16647    pais 
   TABLE DATA           3   COPY public.pais (cod_pais, nome_pais) FROM stdin;
    public          postgres    false    209   �(                 0    16687 
   roteirista 
   TABLE DATA           O   COPY public.roteirista (cod_roteirista, nome_roteirista, cod_pais) FROM stdin;
    public          postgres    false    211   �(       z           2606    16705    ator cod_ator 
   CONSTRAINT     Q   ALTER TABLE ONLY public.ator
    ADD CONSTRAINT cod_ator PRIMARY KEY (cod_ator);
 7   ALTER TABLE ONLY public.ator DROP CONSTRAINT cod_ator;
       public            postgres    false    212            v           2606    16668    diretor cod_diretor 
   CONSTRAINT     Z   ALTER TABLE ONLY public.diretor
    ADD CONSTRAINT cod_diretor PRIMARY KEY (cod_diretor);
 =   ALTER TABLE ONLY public.diretor DROP CONSTRAINT cod_diretor;
       public            postgres    false    210            ~           2606    16771    filme cod_filme 
   CONSTRAINT     T   ALTER TABLE ONLY public.filme
    ADD CONSTRAINT cod_filme PRIMARY KEY (cod_filme);
 9   ALTER TABLE ONLY public.filme DROP CONSTRAINT cod_filme;
       public            postgres    false    214            |           2606    16717    genero genero_pkey 
   CONSTRAINT     X   ALTER TABLE ONLY public.genero
    ADD CONSTRAINT genero_pkey PRIMARY KEY (cod_genero);
 <   ALTER TABLE ONLY public.genero DROP CONSTRAINT genero_pkey;
       public            postgres    false    213            t           2606    16661    pais pais_pkey 
   CONSTRAINT     R   ALTER TABLE ONLY public.pais
    ADD CONSTRAINT pais_pkey PRIMARY KEY (cod_pais);
 8   ALTER TABLE ONLY public.pais DROP CONSTRAINT pais_pkey;
       public            postgres    false    209            x           2606    16693    roteirista roteirista_pkey 
   CONSTRAINT     d   ALTER TABLE ONLY public.roteirista
    ADD CONSTRAINT roteirista_pkey PRIMARY KEY (cod_roteirista);
 D   ALTER TABLE ONLY public.roteirista DROP CONSTRAINT roteirista_pkey;
       public            postgres    false    211            �           2606    16800    filme_ator cod_ator    FK CONSTRAINT     x   ALTER TABLE ONLY public.filme_ator
    ADD CONSTRAINT cod_ator FOREIGN KEY (cod_ator) REFERENCES public.ator(cod_ator);
 =   ALTER TABLE ONLY public.filme_ator DROP CONSTRAINT cod_ator;
       public          postgres    false    3194    212    215            �           2606    16782    filme cod_diretor    FK CONSTRAINT        ALTER TABLE ONLY public.filme
    ADD CONSTRAINT cod_diretor FOREIGN KEY (cod_diretor) REFERENCES public.diretor(cod_diretor);
 ;   ALTER TABLE ONLY public.filme DROP CONSTRAINT cod_diretor;
       public          postgres    false    214    3190    210            �           2606    16795    filme_ator cod_filme    FK CONSTRAINT     |   ALTER TABLE ONLY public.filme_ator
    ADD CONSTRAINT cod_filme FOREIGN KEY (cod_filme) REFERENCES public.filme(cod_filme);
 >   ALTER TABLE ONLY public.filme_ator DROP CONSTRAINT cod_filme;
       public          postgres    false    215    214    3198            �           2606    16777    filme cod_genero    FK CONSTRAINT     {   ALTER TABLE ONLY public.filme
    ADD CONSTRAINT cod_genero FOREIGN KEY (cod_genero) REFERENCES public.genero(cod_genero);
 :   ALTER TABLE ONLY public.filme DROP CONSTRAINT cod_genero;
       public          postgres    false    3196    214    213                       2606    16669    diretor cod_pais    FK CONSTRAINT     u   ALTER TABLE ONLY public.diretor
    ADD CONSTRAINT cod_pais FOREIGN KEY (cod_pais) REFERENCES public.pais(cod_pais);
 :   ALTER TABLE ONLY public.diretor DROP CONSTRAINT cod_pais;
       public          postgres    false    209    3188    210            �           2606    16694    roteirista cod_pais    FK CONSTRAINT     x   ALTER TABLE ONLY public.roteirista
    ADD CONSTRAINT cod_pais FOREIGN KEY (cod_pais) REFERENCES public.pais(cod_pais);
 =   ALTER TABLE ONLY public.roteirista DROP CONSTRAINT cod_pais;
       public          postgres    false    209    211    3188            �           2606    16706    ator cod_pais    FK CONSTRAINT     |   ALTER TABLE ONLY public.ator
    ADD CONSTRAINT cod_pais FOREIGN KEY (cod_pais) REFERENCES public.pais(cod_pais) NOT VALID;
 7   ALTER TABLE ONLY public.ator DROP CONSTRAINT cod_pais;
       public          postgres    false    209    3188    212            �           2606    16772    filme cod_pais    FK CONSTRAINT     s   ALTER TABLE ONLY public.filme
    ADD CONSTRAINT cod_pais FOREIGN KEY (cod_pais) REFERENCES public.pais(cod_pais);
 8   ALTER TABLE ONLY public.filme DROP CONSTRAINT cod_pais;
       public          postgres    false    3188    209    214            �           2606    16787    filme cod_roteirista    FK CONSTRAINT     �   ALTER TABLE ONLY public.filme
    ADD CONSTRAINT cod_roteirista FOREIGN KEY (cod_roteirista) REFERENCES public.roteirista(cod_roteirista);
 >   ALTER TABLE ONLY public.filme DROP CONSTRAINT cod_roteirista;
       public          postgres    false    211    214    3192               �   x�%��
�@Eי���Su[HQܸI;A�qD�{S��'��c�[����M��FF01���$�4O����wW�����*3�k���!Prڛ���6Խt���q_��,e@}OO�MK���}y�W;�������!˃n�9Rod+���*���Fu���1�\;e         �   x�%��
�@�뽧�'�c��l���fs9�ك�K����r��&�~�����i�������,6�D
�hTv/���Z�P�n^�A1~��ǈ�Se��T%ZA�$6�4z�P�#t�{�vf�9�fZ��ъE��p��$��R���a�'')?wƘn6�         &  x�U�Mj�@�ץS������x9Lb!$0qVٔ��նԭT���!�\�'�k6!���W��z�~�p/m4M|�g?H�����|?(�ج=�iC�\��c?�.'������n�����S�3+��^��/���i�<�)��.BoU�jM�f��L�����J���ؙO��!C���x�x�� ��|�Ш7T!Z�^W5]?����\�?�XΥ=���K
���i�-.>8�a���[5\@�TW���?���܆#|�F��J^�6A�������2�!���+3𢍫��	�b�{t>#�Wt�k1��8?L)� ��4>I�Qm�<��dK�jG�N���#_G�6�[��+d�~V~;(֡��V�###(	��#fn�%�ژ/Re�;�U����J�"#2�-}��	��=r�	օ��[�����*b��%#���4��Ϟ��%�9pX�%��5��H�{:�~zy�K��;�D̑#tA�rp��`j}[�^��e��ڗs�ݪ���~�-�}����l�+5;�*������i�         ;   x���  B�3cd]����y!A����M�;�l;����|��z	�         ?   x�3�tLN��2�.-.H�+N�2�t,K�+)-J�2�t)J�M�2���z��gr��qqq ��/         I   x�3�t*J,���2���K�I,I-*J�2�t+J�{԰0�˔�%3/17�(9�˘�5ԑˌӳ$1'3�+F��� �P         �   x����@�ݧ��.��Kō۰tɂ$��]�3��͠�</ar6bKq��09�<���t�]�`$�K�J��}cEH�� �M�nI�!5zR�ay�8B�c����7���VJ������3�x�����l�/	V���Nc�R+3F     