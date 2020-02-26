<template>
<div class="aProperty">{{ aProperty }}</div>
</template>

<script lang="ts">
import { Component, Prop, Vue } from 'vue-property-decorator';

@Component
export default class BaseComponent extends Vue {
    @Prop() private aProperty!: string;
}
</script>

<style scoped lang="scss">
.aProperty {
    color: gray;
}
</style>
