package com.github.tototoshi.fixture

import org.scalatest.FunSuite

class StringUtilTest extends FunSuite {

  test("#trimLeadingSlashes") {
    assert(StringUtil.trimLeadingSlashes("/hoge") === "hoge")
    assert(StringUtil.trimLeadingSlashes("hoge") === "hoge")
  }

  test("#trimTrailingSlashes") {
    assert(StringUtil.trimTrailingSlashes("hoge/") === "hoge")
    assert(StringUtil.trimTrailingSlashes("hoge") === "hoge")
  }

  test("#trimSlashes") {
    assert(StringUtil.trimSlashes("/hoge/") === "hoge")
    assert(StringUtil.trimSlashes("hoge") === "hoge")
  }

}
