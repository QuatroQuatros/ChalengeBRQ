package br.com.quatroquatros;


import java.sql.Date;
import java.util.List;

import DAO.UsuarioDAOImpl;
import DAO.RecorrenciaDAOImpl;
import DAO.TipoDespesaDAOImpl;
import DAO.TipoRendaDAOImpl;
import DAO.RendasDAOImpl;
import DAO.DespesasDAO;
import DAO.DespesasDAOImpl;
import Models.Usuario;
import Models.TipoDespesa;
import Models.TipoRenda;
import Models.Recorrencia;
import Models.Rendas;
import Models.Despesas;

public class main {
	 private static UsuarioDAOImpl userDao;
	 private static RecorrenciaDAOImpl recorrenciaDao;
	 private static TipoDespesaDAOImpl tipoDespesaDao;
	 private static TipoRendaDAOImpl tipoRendaDao;
	 private static RendasDAOImpl RendasDao;
	 private static DespesasDAOImpl DespesasDao;
	 public static void main(String[] args) {
		userDao = new UsuarioDAOImpl();
		recorrenciaDao = new RecorrenciaDAOImpl();
		tipoDespesaDao = new TipoDespesaDAOImpl();
		tipoRendaDao = new TipoRendaDAOImpl();
		RendasDao = new RendasDAOImpl();
		DespesasDao = new DespesasDAOImpl();
		
		
		
		
		 
//		Usuario usuario = new Usuario("João", "joaozinhogameplays2@gmail.com", "senha123", "09/12/2003", "/imagens/foto.jpg", "37409689885");		
//		userDao.inserirUsuario(usuario);
		
//		Usuario user = userDao.buscarUsuarioPorId(6);
//		System.out.println(user);
		
//		Usuario user = userDao.buscarUsuarioPorEmail("joaozinhogameplays@gmail.com");
//		System.out.println(user);
		
//    List<Usuario> users = userDao.listarTodosUsuarios();
//    for (Usuario user : users) {
//        System.out.println("ID: " + user.getId());
//        System.out.println("Nome: " + user.getNome());
//        System.out.println("Email: " + user.getEmail());
//        System.out.println("Senha: " + user.getSenha());
//        System.out.println("Data de Nascimento: " + user.getDataNascimento());
//        System.out.println("Foto: " + user.getFoto());
//        System.out.println("CPF: " + user.getCpf());
//        System.out.println("----------------------------------");
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
		
			
//	TipoDespesa tipoDespesa = tipoDespesaDao.buscarTipoDespesaPorId(1);
//	System.out.println(tipoDespesa);
//	System.out.println("----------------------------------");
//	tipoDespesaDao.deletarTipoDespesa(1);
//	TipoDespesa tipoDespesa1 = tipoDespesaDao.buscarTipoDespesaPorId(1);
//	System.out.println(tipoDespesa1);
		
	
		//---------------------- RENDAS------------------------------------------------
		

		        // Inserir uma Renda
//        Rendas renda = new Rendas(1, 1, 1, 1000.0f, "Renda mensal", Date.valueOf("2023-10-25"));
//        RendasDao.inserirRendas(renda);
//        System.out.println("Renda inserida com sucesso.");

		        // Buscar uma Renda por ID
//		        Rendas rendaBuscada = RendasDao.buscarRendasPorId(1);
//		        if (rendaBuscada != null) {
//		            System.out.println("Renda encontrada: " + rendaBuscada);
//		        } else {
//		            System.out.println("Renda não encontrada.");
//		        }

//		        // Listar todas as Rendas
//		        List<Rendas> todasRendas = RendasDao.listarTodasRendas();
//		        for (Rendas r : todasRendas) {
//		            System.out.println("Renda: " + r);
//		        }
//
//		        // Atualizar uma Renda
//		        Rendas rendaParaAtualizar = RendasDao.buscarRendasPorId(1);
//		        if (rendaParaAtualizar != null) {
//		            rendaParaAtualizar.setValor(1200.0f);
//		            rendaParaAtualizar.setDescricao("Renda atualizada");
//		            RendasDao.atualizarRendas(rendaParaAtualizar);
//		            System.out.println("Renda atualizada com sucesso.");
//		        } else {
//		            System.out.println("Renda não encontrada para atualizar.");
//		        }
//
//		        // Deletar uma Renda
//		        int idRendaParaDeletar = 1;
//		        RendasDao.deletarRendas(idRendaParaDeletar);
//		        System.out.println("Renda deletada com sucesso.");
		
		//---------------------- Despesas------------------------------------------------

		
        // Inserir uma Despesa
		Despesas despesa = new Despesas();
		despesa.setDescricao("Compra de material de escritório");
		despesa.setValor(100.0);  // Valor fictício
		despesa.setData("2023-10-26");  // Data fictícia no formato "yyyy-MM-dd"

		// Em seguida, você pode chamar o método para inserir a despesa no banco de dados, supondo que DespesasDao esteja corretamente implementado.
		DespesasDao.inserirDespesa(despesa);

		System.out.println("Despesa inserida com sucesso.");


//        // Buscar uma Despesa por ID
//        Despesa despesaBuscada = despesaDAO.buscarDespesaPorId(1);
//        if (despesaBuscada != null) {
//            System.out.println("Despesa encontrada: " + despesaBuscada);
//        } else {
//            System.out.println("Despesa não encontrada.");
//        }
//
//        // Listar todas as Despesas
//        List<Despesa> todasDespesas = despesaDAO.listarTodasDespesas();
//        for (Despesa d : todasDespesas) {
//            System.out.println("Despesa: " + d);
//        }
//
//        // Atualizar uma Despesa
//        Despesa despesaParaAtualizar = despesaDAO.buscarDespesaPorId(1);
//        if (despesaParaAtualizar != null) {
//            despesaParaAtualizar.setValor(1200.0f);
//            despesaParaAtualizar.setDescricao("Despesa atualizada");
//            despesaDAO.atualizarDespesa(despesaParaAtualizar);
//            System.out.println("Despesa atualizada com sucesso.");
//        } else {
//            System.out.println("Despesa não encontrada para atualizar.");
//        }
//
//        // Deletar uma Despesa
//        int idDespesaParaDeletar = 1;
//        despesaDAO.deletarDespesa(idDespesaParaDeletar);
//        System.out.println("Despesa deletada com sucesso.");
//    }
//}
//		    }
	 }}