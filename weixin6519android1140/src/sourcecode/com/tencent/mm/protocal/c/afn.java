package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class afn
  extends azh
{
  public String eBt;
  public String lPj;
  public String mmS;
  public int uuR;
  public LinkedList<bqi> uuS;
  public String uve;
  public String uvf;
  public String uvg;
  public String uvh;
  public String uvi;
  public String uvj;
  public bqo uvk;
  public String uvl;
  public String uvm;
  public String uvn;
  public String uvo;
  public String uvp;
  
  public afn()
  {
    GMTrace.i(3995259109376L, 29767);
    this.uuS = new LinkedList();
    GMTrace.o(3995259109376L, 29767);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3995393327104L, 29768);
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
      if (this.uve != null) {
        paramVarArgs.e(2, this.uve);
      }
      if (this.mmS != null) {
        paramVarArgs.e(3, this.mmS);
      }
      if (this.eBt != null) {
        paramVarArgs.e(4, this.eBt);
      }
      if (this.lPj != null) {
        paramVarArgs.e(5, this.lPj);
      }
      if (this.uvf != null) {
        paramVarArgs.e(6, this.uvf);
      }
      if (this.uvg != null) {
        paramVarArgs.e(7, this.uvg);
      }
      if (this.uvh != null) {
        paramVarArgs.e(8, this.uvh);
      }
      if (this.uvi != null) {
        paramVarArgs.e(9, this.uvi);
      }
      if (this.uvj != null) {
        paramVarArgs.e(10, this.uvj);
      }
      if (this.uvk != null)
      {
        paramVarArgs.fm(11, this.uvk.aYq());
        this.uvk.a(paramVarArgs);
      }
      if (this.uvl != null) {
        paramVarArgs.e(12, this.uvl);
      }
      if (this.uvm != null) {
        paramVarArgs.e(13, this.uvm);
      }
      if (this.uvn != null) {
        paramVarArgs.e(14, this.uvn);
      }
      if (this.uvo != null) {
        paramVarArgs.e(15, this.uvo);
      }
      if (this.uvp != null) {
        paramVarArgs.e(16, this.uvp);
      }
      paramVarArgs.fk(17, this.uuR);
      paramVarArgs.d(18, 8, this.uuS);
      GMTrace.o(3995393327104L, 29768);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.uND != null) {
        i = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      paramInt = i;
      if (this.uve != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.uve);
      }
      i = paramInt;
      if (this.mmS != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.mmS);
      }
      paramInt = i;
      if (this.eBt != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.eBt);
      }
      i = paramInt;
      if (this.lPj != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.lPj);
      }
      paramInt = i;
      if (this.uvf != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.uvf);
      }
      i = paramInt;
      if (this.uvg != null) {
        i = paramInt + b.a.a.b.b.a.f(7, this.uvg);
      }
      paramInt = i;
      if (this.uvh != null) {
        paramInt = i + b.a.a.b.b.a.f(8, this.uvh);
      }
      i = paramInt;
      if (this.uvi != null) {
        i = paramInt + b.a.a.b.b.a.f(9, this.uvi);
      }
      paramInt = i;
      if (this.uvj != null) {
        paramInt = i + b.a.a.b.b.a.f(10, this.uvj);
      }
      i = paramInt;
      if (this.uvk != null) {
        i = paramInt + b.a.a.a.fj(11, this.uvk.aYq());
      }
      paramInt = i;
      if (this.uvl != null) {
        paramInt = i + b.a.a.b.b.a.f(12, this.uvl);
      }
      i = paramInt;
      if (this.uvm != null) {
        i = paramInt + b.a.a.b.b.a.f(13, this.uvm);
      }
      paramInt = i;
      if (this.uvn != null) {
        paramInt = i + b.a.a.b.b.a.f(14, this.uvn);
      }
      i = paramInt;
      if (this.uvo != null) {
        i = paramInt + b.a.a.b.b.a.f(15, this.uvo);
      }
      paramInt = i;
      if (this.uvp != null) {
        paramInt = i + b.a.a.b.b.a.f(16, this.uvp);
      }
      i = b.a.a.a.fh(17, this.uuR);
      int j = b.a.a.a.c(18, 8, this.uuS);
      GMTrace.o(3995393327104L, 29768);
      return paramInt + i + j;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.uuS.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = azh.a(paramVarArgs); paramInt > 0; paramInt = azh.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      GMTrace.o(3995393327104L, 29768);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      afn localafn = (afn)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3995393327104L, 29768);
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
          localafn.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3995393327104L, 29768);
        return 0;
      case 2: 
        localafn.uve = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3995393327104L, 29768);
        return 0;
      case 3: 
        localafn.mmS = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3995393327104L, 29768);
        return 0;
      case 4: 
        localafn.eBt = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3995393327104L, 29768);
        return 0;
      case 5: 
        localafn.lPj = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3995393327104L, 29768);
        return 0;
      case 6: 
        localafn.uvf = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3995393327104L, 29768);
        return 0;
      case 7: 
        localafn.uvg = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3995393327104L, 29768);
        return 0;
      case 8: 
        localafn.uvh = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3995393327104L, 29768);
        return 0;
      case 9: 
        localafn.uvi = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3995393327104L, 29768);
        return 0;
      case 10: 
        localafn.uvj = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3995393327104L, 29768);
        return 0;
      case 11: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bqo();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bqo)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localafn.uvk = ((bqo)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3995393327104L, 29768);
        return 0;
      case 12: 
        localafn.uvl = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3995393327104L, 29768);
        return 0;
      case 13: 
        localafn.uvm = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3995393327104L, 29768);
        return 0;
      case 14: 
        localafn.uvn = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3995393327104L, 29768);
        return 0;
      case 15: 
        localafn.uvo = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3995393327104L, 29768);
        return 0;
      case 16: 
        localafn.uvp = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3995393327104L, 29768);
        return 0;
      case 17: 
        localafn.uuR = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3995393327104L, 29768);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new bqi();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((bqi)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
        localafn.uuS.add(localObject1);
        paramInt += 1;
      }
      GMTrace.o(3995393327104L, 29768);
      return 0;
    }
    GMTrace.o(3995393327104L, 29768);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\afn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */