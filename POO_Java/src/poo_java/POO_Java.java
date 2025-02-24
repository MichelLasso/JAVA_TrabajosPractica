
package poo_java;

import java.util.ArrayList;
import java.util.Scanner;

public class POO_Java {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        //crear
        //eliminar
        //editar
        //leer
        
        try{
            //datos
            hospitales hospital1= new hospitales(0, "Puerto", "cra 3-5");
            departamento departamento1= new departamento(0, "Rosa", "Torre 3-4");
            
            //listas
            ArrayList<hospitales> listHospital= new ArrayList<>();
            ArrayList<ActividadesPersonas> listActividadesPersonas = new ArrayList<>();
            ArrayList<CitasMedicas> listCitasMedicas = new ArrayList<>();
            ArrayList<DepartamentoPersonas> listDepartamentoPersonas= new ArrayList<>();
            ArrayList<EquipoPersonal> listEquipoPersonal = new ArrayList<>();
            ArrayList<HospitalPersonas> listHospitalPersonas= new ArrayList<>();
            ArrayList<actividades> listActividades= new ArrayList<>();
            ArrayList<departamento> listDepartamento= new ArrayList<>();
            ArrayList<equipo> listEquipo= new ArrayList<>();
            ArrayList<pabellon> listPabellon = new ArrayList<>();
            ArrayList<pacientes> listPacientes = new ArrayList<>();
            ArrayList<personas> listPersonas = new ArrayList<>();
            
            // agregar datos
            listDepartamento.add(departamento1);
            System.out.println("CRUD");
            System.out.println("-----");
            System.out.println("Leer ->Departamentos");
            System.out.println("-----");
            for (int i = 0; i < listDepartamento.size(); i++) {
                System.out.println("->" + listDepartamento);
            }
            System.out.println("-----");
            System.out.println("Crear-> Departamento");
            System.out.println("-----");
            System.out.println("Ingrese el id: ");
            int id= scan.nextInt();
            scan.nextLine();
            System.out.println("Ingrese el nombre: ");
            String nombreE= scan.nextLine();
            System.out.println("Ingrese la ubicación: ");
            String ubicacionE= scan.nextLine();
            System.out.println("-----");
            System.out.println("Departamento agregado con éxito :)");
            departamento departamentoE= new departamento(id, nombreE, ubicacionE);
            listDepartamento.add(departamentoE);
            System.out.println(departamentoE);
            System.out.println("-----");
            System.out.println("Lista de departamentos----");
            System.out.println("-----");
            
            for (int i = 0; i < listDepartamento.size(); i++) {
                System.out.println("->" + listDepartamento);
            }
            
            System.out.println("-----");
            System.out.println("Eliminar departamento con id 0");
            System.out.println("-----");
            //se elmina el departamento con el id 0
            listDepartamento.remove(0);
            System.out.println("Departamento eliminado con éxito :)");
            System.out.println("---");
            for (int i = 0; i < listDepartamento.size(); i++) {
                System.out.println("->" + listDepartamento);
            }
            System.out.println("---");
            
            System.out.println("----");
            System.out.println("Actualizar Departamento");
            System.out.println("----");
            // se actualiza el nombre del departamento antes ingresado
            departamentoE.nombre="Camilt";
            
            for (int i = 0; i < listDepartamento.size(); i++) {
                System.out.println(listDepartamento);
            }
        } finally{
            
        }
    }
}
