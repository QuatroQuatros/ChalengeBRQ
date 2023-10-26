CREATE OR REPLACE TRIGGER user_id_trigger
BEFORE INSERT ON usuarios
FOR EACH ROW
BEGIN
  SELECT user_id_sequence.NEXTVAL
  INTO :NEW.id
  FROM dual;
END;
/


CREATE OR REPLACE TRIGGER recorrencias_trigger
BEFORE INSERT ON recorrencias
FOR EACH ROW
BEGIN
  SELECT recorrencias_sequence.NEXTVAL
  INTO :NEW.id
  FROM dual;
END;
/


CREATE OR REPLACE TRIGGER tipos_rendas_trigger
BEFORE INSERT ON tipos_rendas
FOR EACH ROW
BEGIN
  SELECT tipos_rendas_sequence.NEXTVAL
  INTO :NEW.id
  FROM dual;
END;
/


CREATE OR REPLACE TRIGGER tipos_despesas_trigger
BEFORE INSERT ON tipos_despesas
FOR EACH ROW
BEGIN
  SELECT tipos_despesas_sequence.NEXTVAL
  INTO :NEW.id
  FROM dual;
END;
/


CREATE OR REPLACE TRIGGER rendas_sequence_trigger
BEFORE INSERT ON rendas
FOR EACH ROW
BEGIN
  SELECT rendas_sequence.NEXTVAL
  INTO :NEW.id
  FROM dual;
END;
/


CREATE OR REPLACE TRIGGER despesas_sequence_trigger
BEFORE INSERT ON despesas
FOR EACH ROW
BEGIN
  SELECT despesas_sequence.NEXTVAL
  INTO :NEW.id
  FROM dual;
END;
/


CREATE OR REPLACE TRIGGER metas_sequence_trigger
BEFORE INSERT ON metas
FOR EACH ROW
BEGIN
  SELECT metas_sequence.NEXTVAL
  INTO :NEW.id
  FROM dual;
END;
/

CREATE OR REPLACE TRIGGER economia_usuarios_sequence_trigger
BEFORE INSERT ON economia_usuarios
FOR EACH ROW
BEGIN
  SELECT economia_usuarios_sequence.NEXTVAL
  INTO :NEW.id
  FROM dual;
END;
/

CREATE OR REPLACE TRIGGER corretoras_sequence_trigger
BEFORE INSERT ON corretoras
FOR EACH ROW
BEGIN
  SELECT corretoras_sequence.NEXTVAL
  INTO :NEW.id
  FROM dual;
END;
/

CREATE OR REPLACE TRIGGER investimentos_sequence_trigger
BEFORE INSERT ON investimentos
FOR EACH ROW
BEGIN
  SELECT investimentos_sequence.NEXTVAL
  INTO :NEW.id
  FROM dual;
END;
/

DROP TRIGGER investimentos_sequence_trigger