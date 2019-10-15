KairosSystem zaza 

Actor : a1 {
	Out Port op1 {
		connector connector1
	}
}

Actor : a0 {
	Out Port op2 {
		connector c2
	}
}

Actor : a2 {
	In Port ip1 {
		connector connector1
	}
	In Port ip2 {
		connector c2
	}
}

Connector connector1( from "a0.op2" to "a2.ip2")
Connector c2( from "a1.op1" to "a2.ip1")