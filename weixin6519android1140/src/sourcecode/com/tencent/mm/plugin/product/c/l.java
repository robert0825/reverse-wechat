package com.tencent.mm.plugin.product.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public class l
  extends com.tencent.mm.bm.a
{
  public String nIL;
  public int nIM;
  public LinkedList<e> nIN;
  public int nIe;
  public String url;
  
  public l()
  {
    GMTrace.i(6038858235904L, 44993);
    this.nIN = new LinkedList();
    GMTrace.o(6038858235904L, 44993);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(6038992453632L, 44994);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.nIL == null) {
        throw new b("Not all required fields were included: id_info");
      }
      if (this.nIL != null) {
        paramVarArgs.e(1, this.nIL);
      }
      paramVarArgs.fk(2, this.nIM);
      if (this.url != null) {
        paramVarArgs.e(3, this.url);
      }
      paramVarArgs.d(4, 8, this.nIN);
      paramVarArgs.fk(5, this.nIe);
      GMTrace.o(6038992453632L, 44994);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.nIL != null) {
        paramInt = b.a.a.b.b.a.f(1, this.nIL) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.nIM);
      paramInt = i;
      if (this.url != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.url);
      }
      i = b.a.a.a.c(4, 8, this.nIN);
      int j = b.a.a.a.fh(5, this.nIe);
      GMTrace.o(6038992453632L, 44994);
      return paramInt + i + j;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.nIN.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.nIL == null) {
        throw new b("Not all required fields were included: id_info");
      }
      GMTrace.o(6038992453632L, 44994);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      l locall = (l)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(6038992453632L, 44994);
        return -1;
      case 1: 
        locall.nIL = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(6038992453632L, 44994);
        return 0;
      case 2: 
        locall.nIM = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(6038992453632L, 44994);
        return 0;
      case 3: 
        locall.url = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(6038992453632L, 44994);
        return 0;
      case 4: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new e();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((e)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          locall.nIN.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(6038992453632L, 44994);
        return 0;
      }
      locall.nIe = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(6038992453632L, 44994);
      return 0;
    }
    GMTrace.o(6038992453632L, 44994);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\product\c\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */