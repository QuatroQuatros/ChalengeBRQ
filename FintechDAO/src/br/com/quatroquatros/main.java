package br.com.quatroquatros;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import DAO.UsuarioDAOImpl;
import DAO.EconomiaUsuarioDAO;
import DAO.EconomiaUsuarioDAOImpl;
import DAO.MetaDAO;
import DAO.MetaDAOImpl;
import DAO.RecorrenciaDAOImpl;
import DAO.TipoDespesaDAOImpl;
import DAO.TipoRendaDAOImpl;
import Models.Usuario;
import Models.TipoDespesa;
import Models.TipoRenda;
import Models.EconomiaUsuario;
import Models.Meta;
import Models.Recorrencia;

public class main {
	 private static UsuarioDAOImpl userDao;
	 private static RecorrenciaDAOImpl recorrenciaDao;
	 private static TipoDespesaDAOImpl tipoDespesaDao;
	 private static TipoRendaDAOImpl tipoRendaDao;
	 private static MetaDAOImpl metaDAO;
	 private static EconomiaUsuarioDAO economiaUsuarioDAO;

	public static void main(String[] args) {
		userDao = new UsuarioDAOImpl();
		recorrenciaDao = new RecorrenciaDAOImpl();
		tipoDespesaDao = new TipoDespesaDAOImpl();
		tipoRendaDao = new TipoRendaDAOImpl();
		metaDAO = new MetaDAOImpl();
		economiaUsuarioDAO = new EconomiaUsuarioDAOImpl();
		 
//		Usuario usuario = new Usuario("Larissa Manoela", "LarissaManoela@gmail.com", "cirilo", "09/12/2002", "/imagens/foto.jpg", "45785468121");		
//		userDao.inserirUsuario(usuario);
		
		//Usuario user = userDao.buscarUsuarioPorId(21);
		//System.out.println(user);
		
//		Usuario user = userDao.buscarUsuarioPorEmail("joaozinhogameplays@gmail.com");
//		System.out.println(user);
		
//	    List<Usuario> users = userDao.listarTodosUsuarios();
//	    for (Usuario user : users) {
//	        System.out.println("ID: " + user.getId());
//	        System.out.println("Nome: " + user.getNome());
//	        System.out.println("Email: " + user.getEmail());
//	        System.out.println("Senha: " + user.getSenha());
//	        System.out.println("Data de Nascimento: " + user.getDataNascimento());
//	        System.out.println("Foto: " + user.getFoto());
//	        System.out.println("CPF: " + user.getCpf());
//	        System.out.println("----------------------------------");
//	    }
		
//		Usuario user = userDao.buscarUsuarioPorId(6);
//		System.out.println(user.getNome());
//		user.setNome("Kleberson");
//	    userDao.atualizarUsuario(user);
//		System.out.println(user.getNome());

//		Usuario user = userDao.buscarUsuarioPorId(6);
//		System.out.println(user);
//	    userDao.deletarUsuario(6);
//		Usuario user2 = userDao.buscarUsuarioPorId(6);
//		System.out.println(user2);
			
//----------------RECORRENCIA----------------------------------------------
//		Recorrencia recorrencia = new Recorrencia("mensal", 0.10);
//		recorrenciaDao.inserirRecorrencia(recorrencia);
//		System.out.println("batata");
		
//		Recorrencia recorrencia = recorrenciaDao.buscarRecorrenciaPorId(5);
//		System.out.println(recorrencia);
		
//	    List<Recorrencia> recorrencias = recorrenciaDao.listarTodasRecorrencias();
//	    for (Recorrencia recorrencia : recorrencias) {
//	        System.out.println("ID: " + recorrencia.getId());
//	        System.out.println("Descrição: " + recorrencia.getDescricao());
//	        System.out.println("juros: " + recorrencia.getJuros());
//	        System.out.println("----------------------------------");
//	    }
		
//		Recorrencia recorrencia = recorrenciaDao.buscarRecorrenciaPorId(5);
//		System.out.println(recorrencia);
//		recorrencia.setDescricao("teste");
//	    recorrenciaDao.atualizarRecorrencia(recorrencia);
//	    System.out.println("----------------------------------");
//		System.out.println(recorrencia);
		
//		Recorrencia recorrencia = recorrenciaDao.buscarRecorrenciaPorId(5);
//		System.out.println(recorrencia);
//		System.out.println("----------------------------------");
//		recorrenciaDao.deletarRecorrencia(5);
//	    Recorrencia recorrencia2 = recorrenciaDao.buscarRecorrenciaPorId(5);
//	    System.out.println(recorrencia2);
//----------------------TIPO RENDA------------------------------------------------
		
//		TipoRenda tipoRenda =  new TipoRenda("Ativa");
//		tipoRendaDao.inserirTipoRenda(tipoRenda);
//		System.out.println("Batata");
		
//		TipoRenda tipoRenda = tipoRendaDao.buscarTipoRendaPorId(1);
//		System.out.println(tipoRenda);
		
//		List<TipoRenda> tiposRendas = tipoRendaDao.listarTodosTiposRendas();
//	    for (TipoRenda tipoRenda : tiposRendas) {
//	        System.out.println("ID: " + tipoRenda.getId());
//	        System.out.println("Descrição: " + tipoRenda.getDescricao());
//	        System.out.println("----------------------------------");
//	    }
//		
//		TipoRenda tipoRenda = tipoRendaDao.buscarTipoRendaPorId(1);
//		System.out.println(tipoRenda);
//		System.out.println("----------------------------------");
//		tipoRenda.setDescricao("Passiva");
//		tipoRendaDao.atualizarTipoRenda(tipoRenda);
//		System.out.println(tipoRenda);
		
			
//		TipoRenda tipoRenda = tipoRendaDao.buscarTipoRendaPorId(1);
//		System.out.println(tipoRenda);
//		System.out.println("----------------------------------");
//		tipoRendaDao.deletarTipoRenda(1);
//		TipoRenda tipoRenda1 = tipoRendaDao.buscarTipoRendaPorId(1);
//		System.out.println(tipoRenda1);
		
		
//----------------------TIPO DESPESA------------------------------------------------
		
//		TipoDespesa tipoDespesa =  new TipoDespesa("Ativa");
//		tipoDespesaDao.inserirTipoDespesa(tipoDespesa);
//		System.out.println("Batata");
		
//		TipoDespesa tipoDespesa = tipoDespesaDao.buscarTipoDespesaPorId(1);
//		System.out.println(tipoDespesa);
		
//		List<TipoDespesa> tiposDespesas = tipoDespesaDao.listarTodosTiposDespesas();
//	    for (TipoDespesa tipoDespesa : tiposDespesas) {
//	        System.out.println("ID: " + tipoDespesa.getId());
//	        System.out.println("Descrição: " + tipoDespesa.getDescricao());
//	        System.out.println("----------------------------------");
//	    }
//		
//		TipoDespesa tipoDespesa = tipoDespesaDao.buscarTipoDespesaPorId(1);
//		System.out.println(tipoDespesa);
//		System.out.println("----------------------------------");
//		tipoDespesa.setDescricao("Passiva");
//		tipoDespesaDao.atualizarTipoDespesa(tipoDespesa);
//		System.out.println(tipoDespesa);
		
			
//		TipoDespesa tipoDespesa = tipoDespesaDao.buscarTipoDespesaPorId(1);
//		System.out.println(tipoDespesa);
//		System.out.println("----------------------------------");
//		tipoDespesaDao.deletarTipoDespesa(1);
//		TipoDespesa tipoDespesa1 = tipoDespesaDao.buscarTipoDespesaPorId(1);
//		System.out.println(tipoDespesa1);

		
//----------------------METAS------------------------------------------------
			
//		Meta meta = new Meta(44, "Comprar milho na praia", 10.00, "22/10/2024", "25/10/2024", 1);
//		metaDAO.inserirMeta(meta);
		
		
//		Meta metaEncontrada = metaDAO.buscarMetaPorId(11);
//		if (metaEncontrada != null) {
//		    System.out.println("Meta encontrada: ");
//		    System.out.println("ID: " + metaEncontrada.getId());
//		    System.out.println("ID do Usuário: " + metaEncontrada.getIdUsuario());
//		    System.out.println("Descrição: " + metaEncontrada.getDescricao());
//		    System.out.println("Valor: " + metaEncontrada.getValor());
//		    System.out.println("Data Conclusão Estimada: " + metaEncontrada.getDataConclusaoEstimada());
//		    System.out.println("Data Conclusão: " + metaEncontrada.getDataConclusao());
//		    System.out.println("Status: " + metaEncontrada.getStatus());
//		    
//		    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
//		    String createdAtFormatted = sdf.format(metaEncontrada.getCreatedAt());
//		    System.out.println("Data de Criação: " + createdAtFormatted);
//		    
//		    String updatedAtFormatted = sdf.format(metaEncontrada.getUpdatedAt());
//		    System.out.println("Data de Atualização: " + updatedAtFormatted);
//		} else {
//		    System.out.println("Meta não encontrada.");
//		}
		
		
//		List<Meta> metas = metaDAO.listarTodasMetas();
//	    for (Meta meta : metas) {
//	        System.out.println("ID: " + meta.getId());
//	        System.out.println("ID Usuário: " + meta.getIdUsuario());
//	        System.out.println("Descrição: " + meta.getDescricao());
//	        System.out.println("Valor: " + meta.getValor());
//	        System.out.println("Data de Conclusão Estimada: " + meta.getDataConclusaoEstimada());
//	        System.out.println("Data de Conclusão: " + meta.getDataConclusao());
//	        System.out.println("Status: " + meta.getStatus());
//	        System.out.println("Criado em: " + meta.getCreatedAt());
//	        System.out.println("Atalizado em: " + meta.getUpdatedAt());
//	        System.out.println("----------------------------------");
//	    }
	    
//	    Meta metaParaAtualizar = new Meta();
//	    metaParaAtualizar.setDescricao("Construir casa na arvore da frente");
//	    metaParaAtualizar.setValor(500.00);
//	    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//	    try {
//	    	java.util.Date dataConclusao = sdf.parse("31/12/2023");
//	    	metaParaAtualizar.setDataConclusao(dataConclusao);
//	    } catch (ParseException e) {
//	    	e.printStackTrace();
//	    }
//	    metaParaAtualizar.setId(10);
//
//    	metaDAO.atualizarMeta(metaParaAtualizar);

		//----Atualizar Status Meta -----//	
//		
////		Meta atualizarStatusMeta = new Meta();
////		atualizarStatusMeta.setStatus(0);
////		atualizarStatusMeta.setId(10);
////		metaDAO.atualizarStatusMeta(atualizarStatusMeta);
//		
		//----Deletar Meta----/		
//	    metaDAO.deletarMeta(10);
	    
	    //----Deletar todas as metas do usuario----//
//	    metaDAO.deletarTodasMetasUsuario(10);
		
		
//----------------------ECONOMIA_USUARIO------------------------------------------------
		
		//Insert
//		EconomiaUsuario economiaUsuario = new EconomiaUsuario();
//        economiaUsuario.setIdUsuario(44);
//        economiaUsuario.setMes(new java.util.Date());
//        economiaUsuario.setValor(2.50);
//
//        economiaUsuarioDAO.inserirEconomiaUsuario(economiaUsuario);
		
		//Buscar enoconia por ID
//		EconomiaUsuario economiaUsuarioEncontrada = economiaUsuarioDAO.buscarEconomiaUsuarioPorId(2);
//
//		if (economiaUsuarioEncontrada != null) {
//		    System.out.println("EconomiaUsuario encontrada: " + economiaUsuarioEncontrada.getId());
//		    System.out.println("ID do Usuário: " + economiaUsuarioEncontrada.getIdUsuario());
//		    System.out.println("Mês: " + economiaUsuarioEncontrada.getMes());
//		    System.out.println("Valor: " + economiaUsuarioEncontrada.getValor());
//		    System.out.println("Data de Criação: " + economiaUsuarioEncontrada.getCreatedAt());
//		    System.out.println("Data de Atualização: " + economiaUsuarioEncontrada.getUpdatedAt());
//		} else {
//		    System.out.println("EconomiaUsuario não encontrada.");
//		}

		
		//Retornar todas as economias da tabela
//		List<EconomiaUsuario> economias = economiaUsuarioDAO.listarTodasEconomiasUsuario();
//
//		for (EconomiaUsuario economia : economias) {
//		    System.out.println("ID: " + economia.getId());
//		    System.out.println("ID do Usuário: " + economia.getIdUsuario());
//		    System.out.println("Mês: " + economia.getMes());
//		    System.out.println("Valor: " + economia.getValor());
//		    System.out.println("Data de Criação: " + economia.getCreatedAt());
//		    System.out.println("Data de Atualização: " + economia.getUpdatedAt());
//		    System.out.println("----------------------------------");
//		}
		
		
		//retorna todas economias por usuario
//		List<EconomiaUsuario> economias = economiaUsuarioDAO.listarTodasEconomiasPorUsuario(44);
//
//		if (economias.isEmpty()) {
//		    System.out.println("Não há economias para este usuário.");
//		} else {
//		    for (EconomiaUsuario economia : economias) {
//		        System.out.println("ID: " + economia.getId());
//		        System.out.println("Mês: " + economia.getMes());
//		        System.out.println("Valor: " + economia.getValor());
//		        System.out.println("Criado em " + economia.getCreatedAt());
//		        System.out.println("----------------------------------");
//		    }
//		}



		//Atualiza economia_usuarios
//		EconomiaUsuario economiaUsuarioParaAtualizar = new EconomiaUsuario();
//		economiaUsuarioParaAtualizar.setId(4);
//		economiaUsuarioParaAtualizar.setValor(10.00);
//		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//		try {
//		    java.util.Date novoMes = sdf.parse("01/11/2023"); 
//		    economiaUsuarioParaAtualizar.setMes(novoMes);
//		} catch (ParseException e) {
//		    e.printStackTrace();
//		}
//
//		economiaUsuarioDAO.atualizarEconomiaUsuario(economiaUsuarioParaAtualizar);

		//Deletar economia
//		int idEconomiaParaDeletar = 4;
//		economiaUsuarioDAO.deletarEconomiaUsuario(idEconomiaParaDeletar);

	}

}
