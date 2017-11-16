package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class avz
  extends azh
{
  public int bgh;
  public int eXJ;
  public int jzH;
  public String jzI;
  public String uKJ;
  public String uKM;
  public String uLg;
  public String uLh;
  public String uLi;
  public String uLj;
  public int uLk;
  public LinkedList<qa> uLl;
  public int uLm;
  public LinkedList<qa> uLn;
  public qa uLo;
  public LinkedList<qa> uLp;
  public qa uLq;
  public aog uLr;
  public int uLs;
  public String uLt;
  
  public avz()
  {
    GMTrace.i(17871090483200L, 133150);
    this.uLl = new LinkedList();
    this.uLn = new LinkedList();
    this.uLp = new LinkedList();
    GMTrace.o(17871090483200L, 133150);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(17871224700928L, 133151);
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
      paramVarArgs.fk(2, this.jzH);
      if (this.jzI != null) {
        paramVarArgs.e(3, this.jzI);
      }
      paramVarArgs.fk(4, this.bgh);
      if (this.uLh != null) {
        paramVarArgs.e(5, this.uLh);
      }
      if (this.uLi != null) {
        paramVarArgs.e(6, this.uLi);
      }
      if (this.uLj != null) {
        paramVarArgs.e(7, this.uLj);
      }
      paramVarArgs.fk(8, this.uLk);
      paramVarArgs.d(9, 8, this.uLl);
      paramVarArgs.fk(10, this.eXJ);
      paramVarArgs.fk(11, this.uLm);
      paramVarArgs.d(12, 8, this.uLn);
      if (this.uKJ != null) {
        paramVarArgs.e(13, this.uKJ);
      }
      if (this.uLo != null)
      {
        paramVarArgs.fm(14, this.uLo.aYq());
        this.uLo.a(paramVarArgs);
      }
      paramVarArgs.d(15, 8, this.uLp);
      if (this.uLq != null)
      {
        paramVarArgs.fm(16, this.uLq.aYq());
        this.uLq.a(paramVarArgs);
      }
      if (this.uLr != null)
      {
        paramVarArgs.fm(17, this.uLr.aYq());
        this.uLr.a(paramVarArgs);
      }
      if (this.uKM != null) {
        paramVarArgs.e(18, this.uKM);
      }
      paramVarArgs.fk(19, this.uLs);
      if (this.uLt != null) {
        paramVarArgs.e(20, this.uLt);
      }
      if (this.uLg != null) {
        paramVarArgs.e(21, this.uLg);
      }
      GMTrace.o(17871224700928L, 133151);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uND != null) {
        paramInt = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.jzH);
      paramInt = i;
      if (this.jzI != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.jzI);
      }
      i = paramInt + b.a.a.a.fh(4, this.bgh);
      paramInt = i;
      if (this.uLh != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.uLh);
      }
      i = paramInt;
      if (this.uLi != null) {
        i = paramInt + b.a.a.b.b.a.f(6, this.uLi);
      }
      paramInt = i;
      if (this.uLj != null) {
        paramInt = i + b.a.a.b.b.a.f(7, this.uLj);
      }
      i = paramInt + b.a.a.a.fh(8, this.uLk) + b.a.a.a.c(9, 8, this.uLl) + b.a.a.a.fh(10, this.eXJ) + b.a.a.a.fh(11, this.uLm) + b.a.a.a.c(12, 8, this.uLn);
      paramInt = i;
      if (this.uKJ != null) {
        paramInt = i + b.a.a.b.b.a.f(13, this.uKJ);
      }
      i = paramInt;
      if (this.uLo != null) {
        i = paramInt + b.a.a.a.fj(14, this.uLo.aYq());
      }
      i += b.a.a.a.c(15, 8, this.uLp);
      paramInt = i;
      if (this.uLq != null) {
        paramInt = i + b.a.a.a.fj(16, this.uLq.aYq());
      }
      i = paramInt;
      if (this.uLr != null) {
        i = paramInt + b.a.a.a.fj(17, this.uLr.aYq());
      }
      paramInt = i;
      if (this.uKM != null) {
        paramInt = i + b.a.a.b.b.a.f(18, this.uKM);
      }
      i = paramInt + b.a.a.a.fh(19, this.uLs);
      paramInt = i;
      if (this.uLt != null) {
        paramInt = i + b.a.a.b.b.a.f(20, this.uLt);
      }
      i = paramInt;
      if (this.uLg != null) {
        i = paramInt + b.a.a.b.b.a.f(21, this.uLg);
      }
      GMTrace.o(17871224700928L, 133151);
      return i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.uLl.clear();
      this.uLn.clear();
      this.uLp.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = azh.a(paramVarArgs); paramInt > 0; paramInt = azh.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      GMTrace.o(17871224700928L, 133151);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      avz localavz = (avz)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(17871224700928L, 133151);
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
          localavz.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(17871224700928L, 133151);
        return 0;
      case 2: 
        localavz.jzH = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(17871224700928L, 133151);
        return 0;
      case 3: 
        localavz.jzI = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(17871224700928L, 133151);
        return 0;
      case 4: 
        localavz.bgh = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(17871224700928L, 133151);
        return 0;
      case 5: 
        localavz.uLh = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(17871224700928L, 133151);
        return 0;
      case 6: 
        localavz.uLi = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(17871224700928L, 133151);
        return 0;
      case 7: 
        localavz.uLj = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(17871224700928L, 133151);
        return 0;
      case 8: 
        localavz.uLk = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(17871224700928L, 133151);
        return 0;
      case 9: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new qa();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((qa)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localavz.uLl.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(17871224700928L, 133151);
        return 0;
      case 10: 
        localavz.eXJ = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(17871224700928L, 133151);
        return 0;
      case 11: 
        localavz.uLm = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(17871224700928L, 133151);
        return 0;
      case 12: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new qa();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((qa)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localavz.uLn.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(17871224700928L, 133151);
        return 0;
      case 13: 
        localavz.uKJ = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(17871224700928L, 133151);
        return 0;
      case 14: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new qa();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((qa)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localavz.uLo = ((qa)localObject1);
          paramInt += 1;
        }
        GMTrace.o(17871224700928L, 133151);
        return 0;
      case 15: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new qa();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((qa)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localavz.uLp.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(17871224700928L, 133151);
        return 0;
      case 16: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new qa();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((qa)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localavz.uLq = ((qa)localObject1);
          paramInt += 1;
        }
        GMTrace.o(17871224700928L, 133151);
        return 0;
      case 17: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new aog();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((aog)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localavz.uLr = ((aog)localObject1);
          paramInt += 1;
        }
        GMTrace.o(17871224700928L, 133151);
        return 0;
      case 18: 
        localavz.uKM = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(17871224700928L, 133151);
        return 0;
      case 19: 
        localavz.uLs = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(17871224700928L, 133151);
        return 0;
      case 20: 
        localavz.uLt = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(17871224700928L, 133151);
        return 0;
      }
      localavz.uLg = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(17871224700928L, 133151);
      return 0;
    }
    GMTrace.o(17871224700928L, 133151);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\avz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */