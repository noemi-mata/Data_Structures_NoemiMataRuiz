/*
* Interfas Pila Generica
*Autor: Noemi Mata Ruiz
*Fecha 29 octubre 2026
*/


package src;

public interface IPila<T> {
	public void pop();
	public void push(T dato);
	public T peek();
	public boolean isEmpty();
}