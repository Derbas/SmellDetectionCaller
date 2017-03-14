/*******************************************************************************
 * Copyright (c) 2014 Yann-Ga�l Gu�h�neuc and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/old-licenses/gpl-2.0.html
 * 
 * Contributors:
 *     Yann-Ga�l Gu�h�neuc and others, see in file; API and its implementation
 ******************************************************************************/
//
// Generated by JTB 1.2.2
//

package util.parser.java.v14.nodes;

/**
 * Grammar production:
 * f0 -> "try"
 * f1 -> Block()
 * f2 -> ( "catch" "(" FormalParameter() ")" Block() )*
 * f3 -> [ "finally" Block() ]
 */
public class TryStatement implements Node {
   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
public NodeToken f0;
   public Block f1;
   public NodeListOptional f2;
   public NodeOptional f3;

   public TryStatement(NodeToken n0, Block n1, NodeListOptional n2, NodeOptional n3) {
      this.f0 = n0;
      this.f1 = n1;
      this.f2 = n2;
      this.f3 = n3;
   }

   public TryStatement(Block n0, NodeListOptional n1, NodeOptional n2) {
      this.f0 = new NodeToken("try");
      this.f1 = n0;
      this.f2 = n1;
      this.f3 = n2;
   }

   public void accept(util.parser.java.v14.visitors.Visitor v) {
      v.visit(this);
   }
   public Object accept(util.parser.java.v14.visitors.ObjectVisitor v, Object argu) {
      return v.visit(this,argu);
   }
}
