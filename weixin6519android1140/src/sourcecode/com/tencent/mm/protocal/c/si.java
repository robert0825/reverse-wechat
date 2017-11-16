package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class si
  extends com.tencent.mm.bm.a
{
  public String uih;
  public String uit;
  public LinkedList<String> uiu;
  public boolean uiv;
  
  public si()
  {
    GMTrace.i(3861578252288L, 28771);
    this.uiu = new LinkedList();
    GMTrace.o(3861578252288L, 28771);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3861712470016L, 28772);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uih == null) {
        throw new b("Not all required fields were included: LoginUrl");
      }
      if (this.uih != null) {
        paramVarArgs.e(1, this.uih);
      }
      if (this.uit != null) {
        paramVarArgs.e(2, this.uit);
      }
      paramVarArgs.d(3, 1, this.uiu);
      paramVarArgs.ah(4, this.uiv);
      GMTrace.o(3861712470016L, 28772);
      return 0;
    }
    if (paramInt == 1) {
      if (this.uih == null) {
        break label447;
      }
    }
    label447:
    for (paramInt = b.a.a.b.b.a.f(1, this.uih) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.uit != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.uit);
      }
      paramInt = b.a.a.a.c(3, 1, this.uiu);
      int j = b.a.a.b.b.a.cK(4);
      GMTrace.o(3861712470016L, 28772);
      return i + paramInt + (j + 1);
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.uiu.clear();
        paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        if (this.uih == null) {
          throw new b("Not all required fields were included: LoginUrl");
        }
        GMTrace.o(3861712470016L, 28772);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        si localsi = (si)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3861712470016L, 28772);
          return -1;
        case 1: 
          localsi.uih = locala.yqV.readString();
          GMTrace.o(3861712470016L, 28772);
          return 0;
        case 2: 
          localsi.uit = locala.yqV.readString();
          GMTrace.o(3861712470016L, 28772);
          return 0;
        case 3: 
          localsi.uiu.add(locala.yqV.readString());
          GMTrace.o(3861712470016L, 28772);
          return 0;
        }
        localsi.uiv = locala.csU();
        GMTrace.o(3861712470016L, 28772);
        return 0;
      }
      GMTrace.o(3861712470016L, 28772);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\si.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */