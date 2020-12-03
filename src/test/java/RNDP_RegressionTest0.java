import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RNDP_RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RNDP_RegressionTest0.test01");
        tutorial.Warehouse warehouse0 = null;
        tutorial.ShoppingCart shoppingCart1 = new tutorial.ShoppingCart(warehouse0);
        // The following exception was thrown during execution in test generation
        try {
            shoppingCart1.addOne("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RNDP_RegressionTest0.test02");
        tutorial.Warehouse warehouse0 = new tutorial.Warehouse();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = warehouse0.addProduct("", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Qty must be positive");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RNDP_RegressionTest0.test03");
        tutorial.Warehouse warehouse0 = new tutorial.Warehouse();
        java.lang.Class<?> wildcardClass1 = warehouse0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RNDP_RegressionTest0.test04");
        tutorial.Warehouse warehouse0 = null;
        tutorial.ShoppingCart shoppingCart1 = new tutorial.ShoppingCart(warehouse0);
        // The following exception was thrown during execution in test generation
        try {
            shoppingCart1.removeOne("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Product not in cart: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RNDP_RegressionTest0.test05");
        tutorial.Warehouse warehouse0 = new tutorial.Warehouse();
        tutorial.ShoppingCart shoppingCart1 = new tutorial.ShoppingCart(warehouse0);
        java.lang.Class<?> wildcardClass2 = shoppingCart1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RNDP_RegressionTest0.test06");
        tutorial.Warehouse warehouse0 = new tutorial.Warehouse();
        tutorial.ShoppingCart shoppingCart1 = new tutorial.ShoppingCart(warehouse0);
        java.lang.Class<?> wildcardClass2 = warehouse0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RNDP_RegressionTest0.test07");
        tutorial.Warehouse warehouse0 = new tutorial.Warehouse();
        tutorial.ShoppingCart shoppingCart1 = new tutorial.ShoppingCart(warehouse0);
        // The following exception was thrown during execution in test generation
        try {
            shoppingCart1.removeOne("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Product not in cart: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RNDP_RegressionTest0.test08");
        tutorial.Warehouse warehouse0 = new tutorial.Warehouse();
        int int2 = warehouse0.availableQty("");
        java.lang.Class<?> wildcardClass3 = warehouse0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RNDP_RegressionTest0.test09");
        tutorial.Warehouse warehouse0 = null;
        tutorial.ShoppingCart shoppingCart1 = new tutorial.ShoppingCart(warehouse0);
        java.lang.Class<?> wildcardClass2 = shoppingCart1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RNDP_RegressionTest0.test10");
        tutorial.Warehouse warehouse0 = new tutorial.Warehouse();
        tutorial.ShoppingCart shoppingCart1 = new tutorial.ShoppingCart(warehouse0);
        // The following exception was thrown during execution in test generation
        try {
            shoppingCart1.addOne("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Not enough qty left of product: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RNDP_RegressionTest0.test11");
        tutorial.Warehouse warehouse0 = new tutorial.Warehouse();
        tutorial.ShoppingCart shoppingCart1 = new tutorial.ShoppingCart(warehouse0);
        int int3 = warehouse0.reserveProduct("hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = warehouse0.addProduct("", (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Qty must be positive");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RNDP_RegressionTest0.test12");
        tutorial.Warehouse warehouse0 = new tutorial.Warehouse();
        tutorial.ShoppingCart shoppingCart1 = new tutorial.ShoppingCart(warehouse0);
        tutorial.ShoppingCart shoppingCart2 = new tutorial.ShoppingCart(warehouse0);
        // The following exception was thrown during execution in test generation
        try {
            shoppingCart2.removeOne("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Product not in cart: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RNDP_RegressionTest0.test13");
        tutorial.Warehouse warehouse0 = new tutorial.Warehouse();
        tutorial.ShoppingCart shoppingCart1 = new tutorial.ShoppingCart(warehouse0);
        int int3 = warehouse0.availableQty("hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = warehouse0.addProduct("hi!", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Qty must be positive");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RNDP_RegressionTest0.test14");
        tutorial.Warehouse warehouse0 = null;
        tutorial.ShoppingCart shoppingCart1 = new tutorial.ShoppingCart(warehouse0);
        // The following exception was thrown during execution in test generation
        try {
            shoppingCart1.addOne("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RNDP_RegressionTest0.test15");
        tutorial.Warehouse warehouse0 = new tutorial.Warehouse();
        tutorial.ShoppingCart shoppingCart1 = new tutorial.ShoppingCart(warehouse0);
        tutorial.ShoppingCart shoppingCart2 = new tutorial.ShoppingCart(warehouse0);
        // The following exception was thrown during execution in test generation
        try {
            shoppingCart2.addOne("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Not enough qty left of product: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RNDP_RegressionTest0.test16");
        tutorial.Warehouse warehouse0 = new tutorial.Warehouse();
        tutorial.ShoppingCart shoppingCart1 = new tutorial.ShoppingCart(warehouse0);
        int int3 = warehouse0.reserveProduct("hi!");
        int int5 = warehouse0.reserveProduct("");
        int int7 = warehouse0.reserveProduct("hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RNDP_RegressionTest0.test17");
        tutorial.Warehouse warehouse0 = new tutorial.Warehouse();
        int int2 = warehouse0.reserveProduct("");
        int int4 = warehouse0.availableQty("hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int7 = warehouse0.addProduct("hi!", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Qty must be positive");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RNDP_RegressionTest0.test18");
        tutorial.Warehouse warehouse0 = new tutorial.Warehouse();
        int int2 = warehouse0.reserveProduct("");
        int int5 = warehouse0.addProduct("", (int) 'a');
        int int7 = warehouse0.availableQty("");
        int int9 = warehouse0.availableQty("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RNDP_RegressionTest0.test19");
        tutorial.Warehouse warehouse0 = new tutorial.Warehouse();
        tutorial.ShoppingCart shoppingCart1 = new tutorial.ShoppingCart(warehouse0);
        // The following exception was thrown during execution in test generation
        try {
            shoppingCart1.addOne("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Not enough qty left of product: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RNDP_RegressionTest0.test20");
        tutorial.Warehouse warehouse0 = new tutorial.Warehouse();
        int int2 = warehouse0.reserveProduct("");
        int int5 = warehouse0.addProduct("", (int) 'a');
        int int7 = warehouse0.availableQty("");
        int int10 = warehouse0.addProduct("hi!", (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RNDP_RegressionTest0.test21");
        tutorial.Warehouse warehouse0 = new tutorial.Warehouse();
        tutorial.ShoppingCart shoppingCart1 = new tutorial.ShoppingCart(warehouse0);
        int int3 = warehouse0.reserveProduct("");
        int int5 = warehouse0.availableQty("hi!");
        int int7 = warehouse0.availableQty("");
        int int9 = warehouse0.availableQty("");
        int int12 = warehouse0.addProduct("", (int) '#');
        int int14 = warehouse0.availableQty("hi!");
        tutorial.ShoppingCart shoppingCart15 = new tutorial.ShoppingCart(warehouse0);
        int int17 = warehouse0.availableQty("");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RNDP_RegressionTest0.test22");
        tutorial.Warehouse warehouse0 = new tutorial.Warehouse();
        tutorial.ShoppingCart shoppingCart1 = new tutorial.ShoppingCart(warehouse0);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = warehouse0.addProduct("hi!", (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Qty must be positive");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RNDP_RegressionTest0.test23");
        tutorial.Warehouse warehouse0 = new tutorial.Warehouse();
        int int2 = warehouse0.reserveProduct("");
        int int4 = warehouse0.availableQty("hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int7 = warehouse0.addProduct("", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Qty must be positive");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RNDP_RegressionTest0.test24");
        tutorial.Warehouse warehouse0 = new tutorial.Warehouse();
        int int2 = warehouse0.reserveProduct("");
        tutorial.ShoppingCart shoppingCart3 = new tutorial.ShoppingCart(warehouse0);
        // The following exception was thrown during execution in test generation
        try {
            shoppingCart3.addOne("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Not enough qty left of product: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RNDP_RegressionTest0.test25");
        tutorial.Warehouse warehouse0 = new tutorial.Warehouse();
        int int2 = warehouse0.reserveProduct("");
        int int4 = warehouse0.availableQty("hi!");
        int int7 = warehouse0.addProduct("", 1);
        int int10 = warehouse0.addProduct("hi!", 10);
        int int12 = warehouse0.reserveProduct("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RNDP_RegressionTest0.test26");
        tutorial.Warehouse warehouse0 = new tutorial.Warehouse();
        tutorial.ShoppingCart shoppingCart1 = new tutorial.ShoppingCart(warehouse0);
        int int3 = warehouse0.availableQty("hi!");
        int int5 = warehouse0.reserveProduct("");
        int int7 = warehouse0.availableQty("hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RNDP_RegressionTest0.test27");
        tutorial.Warehouse warehouse0 = new tutorial.Warehouse();
        tutorial.ShoppingCart shoppingCart1 = new tutorial.ShoppingCart(warehouse0);
        int int3 = warehouse0.reserveProduct("");
        tutorial.ShoppingCart shoppingCart4 = new tutorial.ShoppingCart(warehouse0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RNDP_RegressionTest0.test28");
        tutorial.Warehouse warehouse0 = null;
        tutorial.ShoppingCart shoppingCart1 = new tutorial.ShoppingCart(warehouse0);
        // The following exception was thrown during execution in test generation
        try {
            shoppingCart1.removeOne("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Product not in cart: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RNDP_RegressionTest0.test29");
        tutorial.Warehouse warehouse0 = new tutorial.Warehouse();
        tutorial.ShoppingCart shoppingCart1 = new tutorial.ShoppingCart(warehouse0);
        tutorial.ShoppingCart shoppingCart2 = new tutorial.ShoppingCart(warehouse0);
        int int4 = warehouse0.reserveProduct("");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RNDP_RegressionTest0.test30");
        tutorial.Warehouse warehouse0 = new tutorial.Warehouse();
        int int2 = warehouse0.reserveProduct("hi!");
        java.lang.Class<?> wildcardClass3 = warehouse0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RNDP_RegressionTest0.test31");
        tutorial.Warehouse warehouse0 = new tutorial.Warehouse();
        tutorial.ShoppingCart shoppingCart1 = new tutorial.ShoppingCart(warehouse0);
        int int3 = warehouse0.reserveProduct("");
        int int5 = warehouse0.availableQty("hi!");
        int int7 = warehouse0.availableQty("");
        int int9 = warehouse0.availableQty("");
        int int12 = warehouse0.addProduct("", (int) '#');
        int int14 = warehouse0.availableQty("hi!");
        tutorial.ShoppingCart shoppingCart15 = new tutorial.ShoppingCart(warehouse0);
        // The following exception was thrown during execution in test generation
        try {
            shoppingCart15.removeOne("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Product not in cart: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RNDP_RegressionTest0.test32");
        tutorial.Warehouse warehouse0 = new tutorial.Warehouse();
        int int2 = warehouse0.reserveProduct("");
        int int4 = warehouse0.availableQty("hi!");
        int int7 = warehouse0.addProduct("", 1);
        int int10 = warehouse0.addProduct("hi!", 10);
        java.lang.Class<?> wildcardClass11 = warehouse0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RNDP_RegressionTest0.test33");
        tutorial.Warehouse warehouse0 = new tutorial.Warehouse();
        tutorial.ShoppingCart shoppingCart1 = new tutorial.ShoppingCart(warehouse0);
        // The following exception was thrown during execution in test generation
        try {
            shoppingCart1.removeOne("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Product not in cart: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RNDP_RegressionTest0.test34");
        tutorial.Warehouse warehouse0 = new tutorial.Warehouse();
        tutorial.ShoppingCart shoppingCart1 = new tutorial.ShoppingCart(warehouse0);
        int int3 = warehouse0.availableQty("hi!");
        int int5 = warehouse0.reserveProduct("");
        int int8 = warehouse0.addProduct("hi!", 97);
        int int10 = warehouse0.availableQty("");
        tutorial.ShoppingCart shoppingCart11 = new tutorial.ShoppingCart(warehouse0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RNDP_RegressionTest0.test35");
        tutorial.Warehouse warehouse0 = new tutorial.Warehouse();
        tutorial.ShoppingCart shoppingCart1 = new tutorial.ShoppingCart(warehouse0);
        int int3 = warehouse0.availableQty("hi!");
        int int5 = warehouse0.reserveProduct("");
        tutorial.ShoppingCart shoppingCart6 = new tutorial.ShoppingCart(warehouse0);
        tutorial.ShoppingCart shoppingCart7 = new tutorial.ShoppingCart(warehouse0);
        java.lang.Class<?> wildcardClass8 = warehouse0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RNDP_RegressionTest0.test36");
        tutorial.Warehouse warehouse0 = new tutorial.Warehouse();
        tutorial.ShoppingCart shoppingCart1 = new tutorial.ShoppingCart(warehouse0);
        int int3 = warehouse0.availableQty("hi!");
        int int5 = warehouse0.reserveProduct("");
        tutorial.ShoppingCart shoppingCart6 = new tutorial.ShoppingCart(warehouse0);
        // The following exception was thrown during execution in test generation
        try {
            shoppingCart6.removeOne("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Product not in cart: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RNDP_RegressionTest0.test37");
        tutorial.Warehouse warehouse0 = new tutorial.Warehouse();
        tutorial.ShoppingCart shoppingCart1 = new tutorial.ShoppingCart(warehouse0);
        int int3 = warehouse0.reserveProduct("");
        int int5 = warehouse0.availableQty("hi!");
        int int7 = warehouse0.availableQty("");
        int int9 = warehouse0.availableQty("");
        int int12 = warehouse0.addProduct("", (int) '#');
        java.lang.Class<?> wildcardClass13 = warehouse0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RNDP_RegressionTest0.test38");
        tutorial.Warehouse warehouse0 = new tutorial.Warehouse();
        tutorial.ShoppingCart shoppingCart1 = new tutorial.ShoppingCart(warehouse0);
        int int3 = warehouse0.reserveProduct("");
        int int5 = warehouse0.availableQty("hi!");
        int int7 = warehouse0.availableQty("");
        int int9 = warehouse0.availableQty("hi!");
        java.lang.Class<?> wildcardClass10 = warehouse0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RNDP_RegressionTest0.test39");
        tutorial.Warehouse warehouse0 = new tutorial.Warehouse();
        tutorial.ShoppingCart shoppingCart1 = new tutorial.ShoppingCart(warehouse0);
        int int3 = warehouse0.reserveProduct("");
        int int5 = warehouse0.availableQty("hi!");
        int int7 = warehouse0.availableQty("");
        int int9 = warehouse0.availableQty("");
        int int12 = warehouse0.addProduct("", (int) '#');
        int int14 = warehouse0.availableQty("hi!");
        tutorial.ShoppingCart shoppingCart15 = new tutorial.ShoppingCart(warehouse0);
        shoppingCart15.addOne("");
        shoppingCart15.addOne("");
        shoppingCart15.addOne("");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RNDP_RegressionTest0.test40");
        tutorial.Warehouse warehouse0 = new tutorial.Warehouse();
        int int2 = warehouse0.reserveProduct("");
        tutorial.ShoppingCart shoppingCart3 = new tutorial.ShoppingCart(warehouse0);
        // The following exception was thrown during execution in test generation
        try {
            shoppingCart3.removeOne("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Product not in cart: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RNDP_RegressionTest0.test41");
        tutorial.Warehouse warehouse0 = new tutorial.Warehouse();
        int int2 = warehouse0.availableQty("");
        int int4 = warehouse0.availableQty("");
        int int6 = warehouse0.reserveProduct("hi!");
        java.lang.Class<?> wildcardClass7 = warehouse0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RNDP_RegressionTest0.test42");
        tutorial.Warehouse warehouse0 = new tutorial.Warehouse();
        int int2 = warehouse0.availableQty("");
        int int4 = warehouse0.availableQty("");
        int int6 = warehouse0.reserveProduct("hi!");
        tutorial.ShoppingCart shoppingCart7 = new tutorial.ShoppingCart(warehouse0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RNDP_RegressionTest0.test43");
        tutorial.Warehouse warehouse0 = new tutorial.Warehouse();
        tutorial.ShoppingCart shoppingCart1 = new tutorial.ShoppingCart(warehouse0);
        int int3 = warehouse0.reserveProduct("");
        int int5 = warehouse0.availableQty("hi!");
        int int7 = warehouse0.availableQty("");
        int int9 = warehouse0.availableQty("");
        int int12 = warehouse0.addProduct("", (int) '#');
        int int14 = warehouse0.availableQty("");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RNDP_RegressionTest0.test44");
        tutorial.Warehouse warehouse0 = new tutorial.Warehouse();
        tutorial.ShoppingCart shoppingCart1 = new tutorial.ShoppingCart(warehouse0);
        tutorial.ShoppingCart shoppingCart2 = new tutorial.ShoppingCart(warehouse0);
        java.lang.Class<?> wildcardClass3 = warehouse0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RNDP_RegressionTest0.test45");
        tutorial.Warehouse warehouse0 = new tutorial.Warehouse();
        tutorial.ShoppingCart shoppingCart1 = new tutorial.ShoppingCart(warehouse0);
        int int4 = warehouse0.addProduct("", 96);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 96 + "'", int4 == 96);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RNDP_RegressionTest0.test46");
        tutorial.Warehouse warehouse0 = new tutorial.Warehouse();
        tutorial.ShoppingCart shoppingCart1 = new tutorial.ShoppingCart(warehouse0);
        int int3 = warehouse0.reserveProduct("");
        int int5 = warehouse0.availableQty("hi!");
        int int7 = warehouse0.availableQty("");
        int int9 = warehouse0.availableQty("");
        int int12 = warehouse0.addProduct("", (int) '#');
        int int14 = warehouse0.availableQty("hi!");
        tutorial.ShoppingCart shoppingCart15 = new tutorial.ShoppingCart(warehouse0);
        shoppingCart15.addOne("");
        shoppingCart15.addOne("");
        // The following exception was thrown during execution in test generation
        try {
            shoppingCart15.addOne("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Not enough qty left of product: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RNDP_RegressionTest0.test47");
        tutorial.Warehouse warehouse0 = new tutorial.Warehouse();
        int int2 = warehouse0.availableQty("");
        int int5 = warehouse0.addProduct("", (int) '4');
        int int8 = warehouse0.addProduct("", 35);
        java.lang.Class<?> wildcardClass9 = warehouse0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 87 + "'", int8 == 87);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RNDP_RegressionTest0.test48");
        tutorial.Warehouse warehouse0 = new tutorial.Warehouse();
        tutorial.ShoppingCart shoppingCart1 = new tutorial.ShoppingCart(warehouse0);
        int int3 = warehouse0.availableQty("hi!");
        int int5 = warehouse0.reserveProduct("");
        tutorial.ShoppingCart shoppingCart6 = new tutorial.ShoppingCart(warehouse0);
        // The following exception was thrown during execution in test generation
        try {
            shoppingCart6.addOne("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Not enough qty left of product: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RNDP_RegressionTest0.test49");
        tutorial.Warehouse warehouse0 = new tutorial.Warehouse();
        tutorial.ShoppingCart shoppingCart1 = new tutorial.ShoppingCart(warehouse0);
        int int3 = warehouse0.reserveProduct("");
        int int5 = warehouse0.availableQty("hi!");
        int int7 = warehouse0.availableQty("");
        int int9 = warehouse0.availableQty("");
        int int12 = warehouse0.addProduct("", (int) '#');
        int int14 = warehouse0.availableQty("hi!");
        tutorial.ShoppingCart shoppingCart15 = new tutorial.ShoppingCart(warehouse0);
        int int18 = warehouse0.addProduct("hi!", (int) (byte) 1);
        tutorial.ShoppingCart shoppingCart19 = new tutorial.ShoppingCart(warehouse0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RNDP_RegressionTest0.test50");
        tutorial.Warehouse warehouse0 = new tutorial.Warehouse();
        int int2 = warehouse0.reserveProduct("");
        int int5 = warehouse0.addProduct("", (int) 'a');
        int int7 = warehouse0.reserveProduct("");
        int int9 = warehouse0.reserveProduct("hi!");
        int int11 = warehouse0.availableQty("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 96 + "'", int7 == 96);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 96 + "'", int11 == 96);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RNDP_RegressionTest0.test51");
        tutorial.Warehouse warehouse0 = new tutorial.Warehouse();
        int int2 = warehouse0.availableQty("hi!");
        tutorial.ShoppingCart shoppingCart3 = new tutorial.ShoppingCart(warehouse0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RNDP_RegressionTest0.test52");
        tutorial.Warehouse warehouse0 = new tutorial.Warehouse();
        int int2 = warehouse0.reserveProduct("");
        int int4 = warehouse0.availableQty("hi!");
        int int7 = warehouse0.addProduct("", 1);
        int int10 = warehouse0.addProduct("hi!", 10);
        int int12 = warehouse0.availableQty("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RNDP_RegressionTest0.test53");
        tutorial.Warehouse warehouse0 = new tutorial.Warehouse();
        tutorial.ShoppingCart shoppingCart1 = new tutorial.ShoppingCart(warehouse0);
        int int3 = warehouse0.reserveProduct("");
        int int5 = warehouse0.availableQty("hi!");
        int int7 = warehouse0.availableQty("hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RNDP_RegressionTest0.test54");
        tutorial.Warehouse warehouse0 = new tutorial.Warehouse();
        int int2 = warehouse0.availableQty("");
        int int5 = warehouse0.addProduct("", (int) '4');
        int int7 = warehouse0.availableQty("hi!");
        tutorial.ShoppingCart shoppingCart8 = new tutorial.ShoppingCart(warehouse0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RNDP_RegressionTest0.test55");
        tutorial.Warehouse warehouse0 = new tutorial.Warehouse();
        tutorial.ShoppingCart shoppingCart1 = new tutorial.ShoppingCart(warehouse0);
        int int3 = warehouse0.reserveProduct("");
        int int5 = warehouse0.availableQty("hi!");
        int int7 = warehouse0.availableQty("");
        int int9 = warehouse0.availableQty("");
        int int12 = warehouse0.addProduct("", (int) '#');
        int int14 = warehouse0.availableQty("hi!");
        tutorial.ShoppingCart shoppingCart15 = new tutorial.ShoppingCart(warehouse0);
        // The following exception was thrown during execution in test generation
        try {
            shoppingCart15.removeOne("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Product not in cart: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RNDP_RegressionTest0.test56");
        tutorial.Warehouse warehouse0 = new tutorial.Warehouse();
        tutorial.ShoppingCart shoppingCart1 = new tutorial.ShoppingCart(warehouse0);
        int int3 = warehouse0.availableQty("hi!");
        int int5 = warehouse0.reserveProduct("");
        // The following exception was thrown during execution in test generation
        try {
            int int8 = warehouse0.addProduct("hi!", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Qty must be positive");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RNDP_RegressionTest0.test57");
        tutorial.Warehouse warehouse0 = new tutorial.Warehouse();
        tutorial.ShoppingCart shoppingCart1 = new tutorial.ShoppingCart(warehouse0);
        int int3 = warehouse0.reserveProduct("");
        int int5 = warehouse0.availableQty("hi!");
        int int7 = warehouse0.availableQty("");
        int int9 = warehouse0.availableQty("");
        int int12 = warehouse0.addProduct("", (int) '#');
        int int14 = warehouse0.availableQty("hi!");
        tutorial.ShoppingCart shoppingCart15 = new tutorial.ShoppingCart(warehouse0);
        int int18 = warehouse0.addProduct("hi!", (int) (byte) 1);
        int int20 = warehouse0.reserveProduct("");
        int int23 = warehouse0.addProduct("", 96);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 34 + "'", int20 == 34);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 130 + "'", int23 == 130);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RNDP_RegressionTest0.test58");
        tutorial.Warehouse warehouse0 = new tutorial.Warehouse();
        tutorial.ShoppingCart shoppingCart1 = new tutorial.ShoppingCart(warehouse0);
        int int3 = warehouse0.reserveProduct("hi!");
        java.lang.Class<?> wildcardClass4 = warehouse0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RNDP_RegressionTest0.test59");
        tutorial.Warehouse warehouse0 = new tutorial.Warehouse();
        tutorial.ShoppingCart shoppingCart1 = new tutorial.ShoppingCart(warehouse0);
        int int3 = warehouse0.reserveProduct("");
        int int5 = warehouse0.availableQty("hi!");
        int int7 = warehouse0.availableQty("");
        int int9 = warehouse0.availableQty("");
        int int12 = warehouse0.addProduct("", (int) '#');
        int int14 = warehouse0.availableQty("hi!");
        tutorial.ShoppingCart shoppingCart15 = new tutorial.ShoppingCart(warehouse0);
        shoppingCart15.addOne("");
        shoppingCart15.removeOne("");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }
}

