INSERT INTO public.country (id, country_code, name) VALUES (-1, 'PL', 'POLSKA');
INSERT INTO public.manufacturer (id, address, country_id, name) VALUES (-1, 'Jakas ulica', -1, 'Mitsubishi');
INSERT INTO public.body_type (id, name) VALUES (-1, 'COUPE');

INSERT INTO public.engine_type (id, fuel, type_name) VALUES (-1, 'PB', '4G63T');
INSERT INTO public.part_category (id, category_name) VALUES (-1, 'Uklad korbowy');
INSERT INTO public.part (id, name, part_category_id, price) VALUES (-1, 'Wal korbowy', -1, 200.45);
INSERT INTO public.part_photo (id, description, name, part_id) VALUES (-1, 'opis zdjecia', 'wal1', -1);



INSERT INTO public.vehicle_engine (id, capacity, engine_code, engine_type_id, manufacturer_id ) VALUES (-1, 1798, '4G63T', -1, -1 );
INSERT INTO public.car_model(id, door_count, engine_capacity, manufacturer_id, name, vehicle_body_type_id, vehicle_engine_id, vin) VALUES (-1, 5, 1798, -1, 'testowy', -1, -1, '1234567890123456');
INSERT INTO public.car_model_part (car_model_id, part_id) VALUES (-1, -1);
