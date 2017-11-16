package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class ac
  extends azh
{
  public int tNf;
  public String tNg;
  public bea tNh;
  public aya tNi;
  public int tNp;
  public nt tNt;
  public boolean tNu;
  public int tNv;
  
  public ac()
  {
    GMTrace.i(3967207604224L, 29558);
    GMTrace.o(3967207604224L, 29558);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3967341821952L, 29559);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.uND != null)
      {
        paramVarArgs.fm(1, this.uND.aYq());
        this.uND.a(paramVarArgs);
      }
      paramVarArgs.fk(2, this.tNf);
      if (this.tNg != null) {
        paramVarArgs.e(3, this.tNg);
      }
      if (this.tNh != null)
      {
        paramVarArgs.fm(4, this.tNh.aYq());
        this.tNh.a(paramVarArgs);
      }
      if (this.tNi != null)
      {
        paramVarArgs.fm(5, this.tNi.aYq());
        this.tNi.a(paramVarArgs);
      }
      paramVarArgs.fk(6, this.tNp);
      if (this.tNt != null)
      {
        paramVarArgs.fm(7, this.tNt.aYq());
        this.tNt.a(paramVarArgs);
      }
      paramVarArgs.ah(8, this.tNu);
      paramVarArgs.fk(9, this.tNv);
      GMTrace.o(3967341821952L, 29559);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uND != null) {
        paramInt = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.tNf);
      paramInt = i;
      if (this.tNg != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.tNg);
      }
      i = paramInt;
      if (this.tNh != null) {
        i = paramInt + b.a.a.a.fj(4, this.tNh.aYq());
      }
      paramInt = i;
      if (this.tNi != null) {
        paramInt = i + b.a.a.a.fj(5, this.tNi.aYq());
      }
      i = paramInt + b.a.a.a.fh(6, this.tNp);
      paramInt = i;
      if (this.tNt != null) {
        paramInt = i + b.a.a.a.fj(7, this.tNt.aYq());
      }
      i = b.a.a.b.b.a.cK(8);
      int j = b.a.a.a.fh(9, this.tNv);
      GMTrace.o(3967341821952L, 29559);
      return paramInt + (i + 1) + j;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = azh.a(paramVarArgs); paramInt > 0; paramInt = azh.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      GMTrace.o(3967341821952L, 29559);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      ac localac = (ac)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3967341821952L, 29559);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new es();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((es)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localac.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3967341821952L, 29559);
        return 0;
      case 2: 
        localac.tNf = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3967341821952L, 29559);
        return 0;
      case 3: 
        localac.tNg = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3967341821952L, 29559);
        return 0;
      case 4: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bea();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bea)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localac.tNh = ((bea)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3967341821952L, 29559);
        return 0;
      case 5: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new aya();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((aya)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localac.tNi = ((aya)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3967341821952L, 29559);
        return 0;
      case 6: 
        localac.tNp = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3967341821952L, 29559);
        return 0;
      case 7: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new nt();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((nt)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localac.tNt = ((nt)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3967341821952L, 29559);
        return 0;
      case 8: 
        localac.tNu = ((b.a.a.a.a)localObject1).csU();
        GMTrace.o(3967341821952L, 29559);
        return 0;
      }
      localac.tNv = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(3967341821952L, 29559);
      return 0;
    }
    GMTrace.o(3967341821952L, 29559);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\ac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */