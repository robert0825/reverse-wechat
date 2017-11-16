package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class aa
  extends azh
{
  public int tMX;
  public String tNd;
  public int tNe;
  public int tNf;
  public String tNg;
  public bea tNh;
  public aya tNi;
  public bea tNj;
  public awa tNk;
  public ur tNl;
  public eb tNm;
  public String tNn;
  public String tNo;
  public int tNp;
  
  public aa()
  {
    GMTrace.i(3748030054400L, 27925);
    GMTrace.o(3748030054400L, 27925);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3748164272128L, 27926);
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
      if (this.tNd != null) {
        paramVarArgs.e(2, this.tNd);
      }
      paramVarArgs.fk(3, this.tNe);
      paramVarArgs.fk(4, this.tNf);
      if (this.tNg != null) {
        paramVarArgs.e(5, this.tNg);
      }
      if (this.tNh != null)
      {
        paramVarArgs.fm(6, this.tNh.aYq());
        this.tNh.a(paramVarArgs);
      }
      paramVarArgs.fk(7, this.tMX);
      if (this.tNi != null)
      {
        paramVarArgs.fm(8, this.tNi.aYq());
        this.tNi.a(paramVarArgs);
      }
      if (this.tNj != null)
      {
        paramVarArgs.fm(9, this.tNj.aYq());
        this.tNj.a(paramVarArgs);
      }
      if (this.tNk != null)
      {
        paramVarArgs.fm(10, this.tNk.aYq());
        this.tNk.a(paramVarArgs);
      }
      if (this.tNl != null)
      {
        paramVarArgs.fm(11, this.tNl.aYq());
        this.tNl.a(paramVarArgs);
      }
      if (this.tNm != null)
      {
        paramVarArgs.fm(12, this.tNm.aYq());
        this.tNm.a(paramVarArgs);
      }
      if (this.tNn != null) {
        paramVarArgs.e(13, this.tNn);
      }
      if (this.tNo != null) {
        paramVarArgs.e(14, this.tNo);
      }
      paramVarArgs.fk(15, this.tNp);
      GMTrace.o(3748164272128L, 27926);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uND != null) {
        paramInt = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      i = paramInt;
      if (this.tNd != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.tNd);
      }
      i = i + b.a.a.a.fh(3, this.tNe) + b.a.a.a.fh(4, this.tNf);
      paramInt = i;
      if (this.tNg != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.tNg);
      }
      i = paramInt;
      if (this.tNh != null) {
        i = paramInt + b.a.a.a.fj(6, this.tNh.aYq());
      }
      i += b.a.a.a.fh(7, this.tMX);
      paramInt = i;
      if (this.tNi != null) {
        paramInt = i + b.a.a.a.fj(8, this.tNi.aYq());
      }
      i = paramInt;
      if (this.tNj != null) {
        i = paramInt + b.a.a.a.fj(9, this.tNj.aYq());
      }
      paramInt = i;
      if (this.tNk != null) {
        paramInt = i + b.a.a.a.fj(10, this.tNk.aYq());
      }
      i = paramInt;
      if (this.tNl != null) {
        i = paramInt + b.a.a.a.fj(11, this.tNl.aYq());
      }
      paramInt = i;
      if (this.tNm != null) {
        paramInt = i + b.a.a.a.fj(12, this.tNm.aYq());
      }
      i = paramInt;
      if (this.tNn != null) {
        i = paramInt + b.a.a.b.b.a.f(13, this.tNn);
      }
      paramInt = i;
      if (this.tNo != null) {
        paramInt = i + b.a.a.b.b.a.f(14, this.tNo);
      }
      i = b.a.a.a.fh(15, this.tNp);
      GMTrace.o(3748164272128L, 27926);
      return paramInt + i;
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
      GMTrace.o(3748164272128L, 27926);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      aa localaa = (aa)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3748164272128L, 27926);
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
          localaa.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3748164272128L, 27926);
        return 0;
      case 2: 
        localaa.tNd = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3748164272128L, 27926);
        return 0;
      case 3: 
        localaa.tNe = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3748164272128L, 27926);
        return 0;
      case 4: 
        localaa.tNf = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3748164272128L, 27926);
        return 0;
      case 5: 
        localaa.tNg = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3748164272128L, 27926);
        return 0;
      case 6: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bea();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bea)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localaa.tNh = ((bea)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3748164272128L, 27926);
        return 0;
      case 7: 
        localaa.tMX = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3748164272128L, 27926);
        return 0;
      case 8: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new aya();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((aya)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localaa.tNi = ((aya)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3748164272128L, 27926);
        return 0;
      case 9: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bea();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bea)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localaa.tNj = ((bea)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3748164272128L, 27926);
        return 0;
      case 10: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new awa();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((awa)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localaa.tNk = ((awa)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3748164272128L, 27926);
        return 0;
      case 11: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new ur();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((ur)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localaa.tNl = ((ur)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3748164272128L, 27926);
        return 0;
      case 12: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new eb();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((eb)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localaa.tNm = ((eb)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3748164272128L, 27926);
        return 0;
      case 13: 
        localaa.tNn = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3748164272128L, 27926);
        return 0;
      case 14: 
        localaa.tNo = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3748164272128L, 27926);
        return 0;
      }
      localaa.tNp = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(3748164272128L, 27926);
      return 0;
    }
    GMTrace.o(3748164272128L, 27926);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\aa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */