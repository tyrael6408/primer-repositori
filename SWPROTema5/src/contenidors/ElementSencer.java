package contenidors;

public class ElementSencer {

		int info;
		ElementSencer referencia;
		public ElementSencer(int info, ElementSencer referencia) {
			super();
			this.info = info;
			this.referencia = referencia;
			
		}
		public int getInfo() {
			return info;
		}
		public void setInfo(int info) {
			this.info = info;
		}
		public ElementSencer getReferencia() {
			return referencia;
		}
		public void setReferencia(ElementSencer referencia) {
			this.referencia = referencia;
		}
		@Override
		public String toString() {
			return "ElementSencer [info=" + info + "]";
		}
		
		
		
	}


