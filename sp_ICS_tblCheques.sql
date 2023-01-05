USE [sipdb_bdv]
GO

/****** Object:  StoredProcedure [dbo].[sp_ICS_tblCheques]    Script Date: 4/1/2023 4:02:00 p. m. ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO


CREATE PROCEDURE  [dbo].[sp_ICS_tblCheques]
	@Accion varchar(46) = NULL,			-- Comando INSERT, DELETE, SELECT, ALL
	@FechaContable char(8) = NULL,
	@Cod_Banco char(4) = NULL,
	@Agencia char(4) = NULL,
	@Cajero char(10) = NULL,
	@Din char(10) = NULL,
	@Serial char(8) = NULL,
	@Banco char(4) = NULL,
	@Oficina char(4) =NULL,
	@Dv char(2) =NULL,
	@Cuenta char(10) =NULL,
	@TranCode char(2) =NULL,
	@Monto char(16) =NULL,
	@Front image =NULL,
	@Rear image =NULL,
	@Corregido char(1) =NULL,
	@Transmitido char(1) =NULL,
	@CuentaDepo char(20) =NULL,
	@SerialP char(8) =NULL,
	@Dna char(8) =NULL,
	@Estatus char(3) = NULL,
	@Auxiliar1 varchar(50) =NULL,
	@Auxiliar2 varchar(50) =NULL,
	@Auxiliar3 varchar(50) =NULL,
	@Auxiliar4 varchar(50) =NULL,
	@Auxiliar5 varchar(50) =NULL,
	@TransmitidoOracle char(1) =NULL

AS
    /*  Validación de la Acción   */
	if ( @Accion is NULL )
	begin
		RAISERROR('Accion no puede estar en Blanco',16,-1) 
		goto ETIQUETA_RETORNO
	end

	if ( @Accion = 'SELECT' )	
	begin 
	   if ( @Banco is NULL )
	   	begin
		    RAISERROR('Código de Banco no puede estar en Blanco',16,-1) 
		    goto ETIQUETA_RETORNO
	    end

	    if ( @Oficina is NULL )
	   	begin
		    RAISERROR('Código de Oficina no puede estar en Blanco',16,-1) 
		    goto ETIQUETA_RETORNO
	    end

	    if ( @Dv is NULL )
	   	begin
		    RAISERROR('Dígito Verificador no puede estar en Blanco',16,-1) 
		    goto ETIQUETA_RETORNO
	    end

	    if ( @Cuenta is NULL )
	   	begin
		    RAISERROR('Número de Cuenta no puede estar en Blanco',16,-1) 
		    goto ETIQUETA_RETORNO
	    end   

	    if ( @Serial is NULL )
	   	begin
		    RAISERROR('Número de Serial no puede estar en Blanco',16,-1) 
		end  

	    if exists ( SELECT * FROM tblCheques WHERE Banco = @Banco and Oficina = @Oficina and Dv = @Dv and Cuenta = @Cuenta and Serial = @Serial )
		   begin
	           SELECT * FROM tblCheques WHERE Banco = @Banco and Oficina = @Oficina and Dv = @Dv and Cuenta = @Cuenta and Serial = @Serial 
			   goto ETIQUETA_RETORNO
		   end
		else
		   begin
				RAISERROR('Cheque no existe en la base de datos', -1, -1 )
				goto ETIQUETA_RETORNO
           end

	end



	if ( @Accion = 'INSERT' )	
	begin 
		   if ( @Banco is NULL )
	   	begin
		    RAISERROR('Código de Banco no puede estar en Blanco',16,-1) 
		    goto ETIQUETA_RETORNO
	    end

	    if ( @Oficina is NULL )
	   	begin
		    RAISERROR('Código de Oficina no puede estar en Blanco',16,-1) 
		    goto ETIQUETA_RETORNO
	    end

	    if ( @Dv is NULL )
	   	begin
		    RAISERROR('Dígito Verificador no puede estar en Blanco',16,-1) 
		    goto ETIQUETA_RETORNO
	    end

	    if ( @Cuenta is NULL )
	   	begin
		    RAISERROR('Número de Cuenta no puede estar en Blanco',16,-1) 
		    goto ETIQUETA_RETORNO
	    end   

	    if ( @Serial is NULL )
	   	begin
		    RAISERROR('Número de Serial no puede estar en Blanco',16,-1) 
		end  

	   if exists ( SELECT * FROM tblCheques WHERE Banco = @Banco and Oficina = @Oficina and Dv = @Dv and Cuenta = @Cuenta and Serial = @Serial and Banco = '0102')
		   begin
	           Update tblCheques set
			   		FechaContable=@FechaContable,
					Cod_Banco=@Cod_Banco,
					Agencia=@Agencia,
					Cajero=@Cajero,
					Din=@Din,
					Serial=@Serial,
					Banco=@Banco,
					Oficina=@Oficina,
					Dv=@Dv,
					Cuenta=@Cuenta,
					TranCode=@TranCode,
					Monto=@Monto,
					Front=@Front,
					Rear=@Rear,
					Corregido=@Corregido,
					Transmitido=@Transmitido,
					CuentaDepo=@CuentaDepo,
					SerialP=@SerialP,
					Dna=@Dna,
					Estatus=@Estatus,
					Auxiliar1=@Auxiliar1,
					Auxiliar2=@Auxiliar2,
					Auxiliar3=@Auxiliar3,
					Auxiliar4=@Auxiliar4,
					Auxiliar5=@Auxiliar5,
					TransmitidoOracle=@TransmitidoOracle
				WHERE
				   Banco = @Banco and Oficina = @Oficina and Dv = @Dv and Cuenta = @Cuenta and Serial = @Serial and Banco = '0102'

			   goto ETIQUETA_RETORNO
		   end
		else
		   begin

		       if NOT exists ( SELECT * FROM tblCheques WHERE Banco = @Banco and Oficina = @Oficina and Dv = @Dv and Cuenta = @Cuenta and Serial = @Serial and Banco != '0102')
                  BEGIN
				   INSERT INTO TblCheques VALUES 
					(
						@FechaContable,
						@Cod_Banco,
						@Agencia,
						@Cajero,
						@Din,
						@Serial,
						@Banco,
						@Oficina,
						@Dv,
						@Cuenta,
						@TranCode,
						@Monto,
						@Front,
						@Rear,
						@Corregido,
						@Transmitido,
						@CuentaDepo,
						@SerialP,
						@Dna,
						@Estatus,
						@Auxiliar1,
						@Auxiliar2,
						@Auxiliar3,
						@Auxiliar4,
						@Auxiliar5,
						@TransmitidoOracle
					)
					goto ETIQUETA_RETORNO
				  END

           end
	
	end

ETIQUETA_RETORNO:
GO


