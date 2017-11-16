package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bsl
  extends com.tencent.mm.bm.a
{
  public LinkedList<Integer> vbF;
  public boolean vbG;
  
  public bsl()
  {
    GMTrace.i(3723602427904L, 27743);
    this.vbF = new LinkedList();
    GMTrace.o(3723602427904L, 27743);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3723736645632L, 27744);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.d(1, 2, this.vbF);
      paramVarArgs.ah(2, this.vbG);
      GMTrace.o(3723736645632L, 27744);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.c(1, 2, this.vbF);
      int i = b.a.a.b.b.a.cK(2);
      GMTrace.o(3723736645632L, 27744);
      return paramInt + 0 + (i + 1);
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.vbF.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3723736645632L, 27744);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      bsl localbsl = (bsl)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3723736645632L, 27744);
        return -1;
      case 1: 
        localbsl.vbF.add(Integer.valueOf(locala.yqV.nj()));
        GMTrace.o(3723736645632L, 27744);
        return 0;
      }
      localbsl.vbG = locala.csU();
      GMTrace.o(3723736645632L, 27744);
      return 0;
    }
    GMTrace.o(3723736645632L, 27744);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\bsl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */