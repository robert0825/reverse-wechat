package com.tencent.mm.plugin.game.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class ad
  extends com.tencent.mm.bm.a
{
  public LinkedList<String> lQB;
  public String lQf;
  
  public ad()
  {
    GMTrace.i(12643981066240L, 94205);
    this.lQB = new LinkedList();
    GMTrace.o(12643981066240L, 94205);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(12644115283968L, 94206);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.lQf == null) {
        throw new b("Not all required fields were included: Detail");
      }
      if (this.lQf != null) {
        paramVarArgs.e(2, this.lQf);
      }
      paramVarArgs.d(3, 1, this.lQB);
      GMTrace.o(12644115283968L, 94206);
      return 0;
    }
    if (paramInt == 1) {
      if (this.lQf == null) {
        break label330;
      }
    }
    label330:
    for (paramInt = b.a.a.b.b.a.f(2, this.lQf) + 0;; paramInt = 0)
    {
      int i = b.a.a.a.c(3, 1, this.lQB);
      GMTrace.o(12644115283968L, 94206);
      return paramInt + i;
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.lQB.clear();
        paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        if (this.lQf == null) {
          throw new b("Not all required fields were included: Detail");
        }
        GMTrace.o(12644115283968L, 94206);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        ad localad = (ad)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(12644115283968L, 94206);
          return -1;
        case 2: 
          localad.lQf = locala.yqV.readString();
          GMTrace.o(12644115283968L, 94206);
          return 0;
        }
        localad.lQB.add(locala.yqV.readString());
        GMTrace.o(12644115283968L, 94206);
        return 0;
      }
      GMTrace.o(12644115283968L, 94206);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\c\ad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */