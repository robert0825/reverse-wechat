package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class vq
  extends azh
{
  public int uhM;
  public LinkedList<com.tencent.mm.bm.b> uon;
  public int uoo;
  public LinkedList<Integer> uop;
  
  public vq()
  {
    GMTrace.i(3929089769472L, 29274);
    this.uon = new LinkedList();
    this.uop = new LinkedList();
    GMTrace.o(3929089769472L, 29274);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3929223987200L, 29275);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uND == null) {
        throw new b.a.a.b("Not all required fields were included: BaseResponse");
      }
      if (this.uND != null)
      {
        paramVarArgs.fm(1, this.uND.aYq());
        this.uND.a(paramVarArgs);
      }
      paramVarArgs.d(2, 6, this.uon);
      paramVarArgs.fk(3, this.uoo);
      paramVarArgs.fk(4, this.uhM);
      paramVarArgs.d(5, 2, this.uop);
      GMTrace.o(3929223987200L, 29275);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uND != null) {
        paramInt = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      i = b.a.a.a.c(2, 6, this.uon);
      int j = b.a.a.a.fh(3, this.uoo);
      int k = b.a.a.a.fh(4, this.uhM);
      int m = b.a.a.a.c(5, 2, this.uop);
      GMTrace.o(3929223987200L, 29275);
      return paramInt + i + j + k + m;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.uon.clear();
      this.uop.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = azh.a(paramVarArgs); paramInt > 0; paramInt = azh.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uND == null) {
        throw new b.a.a.b("Not all required fields were included: BaseResponse");
      }
      GMTrace.o(3929223987200L, 29275);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      vq localvq = (vq)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3929223987200L, 29275);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new es();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((es)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localvq.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3929223987200L, 29275);
        return 0;
      case 2: 
        localvq.uon.add(((b.a.a.a.a)localObject1).csV());
        GMTrace.o(3929223987200L, 29275);
        return 0;
      case 3: 
        localvq.uoo = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3929223987200L, 29275);
        return 0;
      case 4: 
        localvq.uhM = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3929223987200L, 29275);
        return 0;
      }
      localvq.uop.add(Integer.valueOf(((b.a.a.a.a)localObject1).yqV.nj()));
      GMTrace.o(3929223987200L, 29275);
      return 0;
    }
    GMTrace.o(3929223987200L, 29275);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\vq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */