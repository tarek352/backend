package spring.session.EvalCand.services;

import spring.session.EvalCand.entities.QR;


public interface QRService {
	public void AjoutQR(QR QR);
	public void deleteQR(QR QR);
	public QR getId_QR(Integer id);	
}
