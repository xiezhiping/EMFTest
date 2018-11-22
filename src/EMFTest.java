import org.eclipse.uml2.uml.internal.impl.ElementImpl;
import org.eclipse.uml2.uml.internal.impl.ModelImpl;
import org.eclipse.uml2.uml.internal.impl.UMLPackageImpl;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.eclipse.uml2.uml.util.UMLUtil;
import org.eclipse.emf.common.util.EList;
//import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.mapping.ecore2xml.impl.Ecore2XMLPackageImpl;
import org.eclipse.papyrus.sysml.blocks.Block;
import org.eclipse.papyrus.sysml.util.SysmlResource;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.DataType;
import org.eclipse.uml2.uml.Extension;
import org.eclipse.uml2.uml.InstanceSpecification;
import org.eclipse.uml2.uml.Lifeline;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.PrimitiveType;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.ProfileApplication;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.internal.impl.CommentImpl;
public class EMFTest {

	private static final Type String = null;
	private static final EList<Type> arg2 = null;
	private static final EList<java.lang.String> arg1 = null;
	private static final Class Class = null;

	public static void main(String[] args) {
		/*
		 * 测试stereotype和profile 
		 * */
		Package package1=(Package) UMLFactory.eINSTANCE.create(UMLPackage.Literals.PACKAGE);
		package1.setName("MyPackage111111111111111111");
		
		Package package2=(Package) UMLFactory.eINSTANCE.create(UMLPackage.Literals.PACKAGE);
		package2.setName("MyPackage2222");
		
		Package package3=(Package) UMLFactory.eINSTANCE.create(UMLPackage.Literals.PACKAGE);
		package3.setName("MyPackage333333");
		InstanceSpecification instanceSpecification = (InstanceSpecification) UMLFactory.eINSTANCE.create(UMLPackage.Literals.INSTANCE_SPECIFICATION); 
		package1.setNestingPackage(package2);
		package3.setNestingPackage(package2);
		
		Profile profile=(Profile) UMLFactory.eINSTANCE.create(UMLPackage.Literals.PROFILE);		
		profile.setName("hangkong");
		profile.setURI("http://www.eclipse.org/uml2/5.0.0/UML/Profile2");
		//package1.applyProfile(profile);
//		System.out.println(profile.getMetaclassReferences().get(0).toString());
		
		//Package umlLibrary=(Package)load
		
//		Stereotype ss=(Stereotype) UMLFactory.eINSTANCE.create(UMLPackage.Literals.STEREOTYPE);
//		ss.setName("feiji");
//		ss.createOwnedAttribute("OSVersion", String);
//		ss.createOwnedOperation("startOperation", arg1, arg2);
//		ss.setPackage(profile);
//		ss.createIcon();
//		profile.createOwnedStereotype("ooooo", false);
//		Property attribute=ss.createOwnedAttribute("isTransient", String);
		
//		ss.getExtendedMetaclasses().add(Class);
		
//		System.out.println(profile);
//		System.out.println(ss.getQualifiedName());
//		System.out.println(ss);
		/*测试计算属性
		 * 
		 * */
		
		//profile.define();
//		System.out.println("extention::::"+extention.getQualifiedName());
		
//		clazz.setPackage(package1);
		
//		profile.define();
//		System.out.println(package2.getOwnedElements().get(0).eClass().getName());
	//	Element el =(Element) UMLFactory.eINSTANCE.create(UMLPackage.Literals.ELEMENT);
		Class clazz =(Class) UMLFactory.eINSTANCE.create(UMLPackage.Literals.CLASS);
		clazz.setName("MyClazz");
		profile.setNestingPackage(package1);
		clazz.setPackage(profile);
		Comment comment =(Comment) UMLFactory.eINSTANCE.create(UMLPackage.Literals.COMMENT);
		EList eList=UMLPackage.Literals.PACKAGE.getEStructuralFeatures();
	//	System.out.println(package1.getOwnedStereotypes());
		comment.setBody("mycomment");
		//dataType.setVisibility("public");
		PrimitiveType pType=(PrimitiveType) UMLFactory.eINSTANCE.create(UMLPackage.Literals.PRIMITIVE_TYPE);
		clazz.getOwnedComments().add(comment);
		Model model=(Model) UMLFactory.eINSTANCE.create(UMLPackage.Literals.MODEL);
		model.setName("myModel");
		//model.setViewpoint("左边");
		
		
	//	model.getOwnedElements().add(clazz);
//		System.out.println(clazz.getNearestPackage());
	//	System.out.println(clazz.getQualifiedName());
		
		//获取元类所有属性
		for (int i=0;i<eList.size();i++)
		{
			System.out.println(eList.get(i));
		}
//		
		Property property =(Property) UMLFactory.eINSTANCE.create(UMLPackage.Literals.PROPERTY);
		property.setName("mp");
		clazz.getOwnedAttributes().add(property);
	//	System.out.println("datatype::"+property.getDatatype()+"   "+clazz.getOwnedAttributes());
//		Element el =(Element) UMLFactory.eINSTANCE.create(UMLPackage.Literals.ELEMENT.getEStructuralFeatures());
//		System.out.println(el.s);
//		System.out.println(clause.getClass().getName());
//		System.out.println(comment.eContainer().getClass());
//		lifeline.setName("a lifeline");
//		System.out.println(lifeline.getQualifiedName());
		
		
		
//		System.out.println("eContants>>>>>>>>>>>>>");
//		EList eList=clazz.eContents();
//		for(int i=0;i<eList.size();i++)
//		{
//			System.out.println(eList.get(i).getClass().getName());
//		}		
	}

}
